package gr.aueb.cf.ch25;

public class ConcurrentFileServerApp {
    public static void main(String[] args) {

        ConcurrentFileServer concurrentFileServer = new ConcurrentFileServer();
        concurrentFileServer.start();
    }
}
