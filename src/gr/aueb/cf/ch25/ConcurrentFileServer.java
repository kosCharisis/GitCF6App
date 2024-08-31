package gr.aueb.cf.ch25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ConcurrentFileServer extends Thread {

    @Override
    public void run() {
        ServerSocket servFd = null;
        final int SERVER_PORT = 7;

        try {
            servFd = new ServerSocket();
            servFd.bind(new InetSocketAddress("127.0.0.1", SERVER_PORT));
            System.out.println("File Server Started ...");

            while (true) {
                Socket connectedFd = servFd.accept();

                PrintWriter pw = new PrintWriter(connectedFd.getOutputStream(), true);
                BufferedReader br = new BufferedReader(new InputStreamReader(connectedFd.getInputStream()));
                System.out.println("Client connected on port" + SERVER_PORT + ". Servicing requests.");
                String line; // = "";

                do {
                    line = br.readLine();
                    pw.println(line);
                    pw.flush();
                } while (!line.equals("ΤΕΛΟΣ"));
                connectedFd.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (servFd != null) servFd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
