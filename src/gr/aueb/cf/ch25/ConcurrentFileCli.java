package gr.aueb.cf.ch25;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ConcurrentFileCli {

    public static void main(String[] args) {
        Socket sockFd = null;

        try {
            InetAddress servAddress = InetAddress.getByName("127.0.0.1");
            final int SERV_PORT = 7;

            sockFd = new Socket(servAddress, SERV_PORT);
            PrintWriter pw = new PrintWriter(sockFd.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(sockFd.getInputStream()));
            File file = new File("C:/tmp/testcon.txt");
            Scanner in = new Scanner(file);
            String line = "";

            do {
                line = in.nextLine();
                pw.println(line);
                pw.flush();
                System.out.println(br.readLine());
            } while (!line.equals("ΤΕΛΟΣ"));

//            sockFd.close();
//            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (sockFd != null) sockFd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
