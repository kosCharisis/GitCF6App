package gr.aueb.cf.ch14;

import javax.swing.plaf.PanelUI;
import java.io.IOException;
import java.time.LocalDateTime;

public class LoggerSingleton {
    private static final LoggerSingleton INSTANCE = new LoggerSingleton();

    private LoggerSingleton() {
    }

     public static LoggerSingleton getInstance() {
        return INSTANCE;
     }

     public void logMessage(Exception e) {
         System.err.println("An error occurred at: " + LocalDateTime.now() + e);
     }

}


