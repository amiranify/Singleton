package ru.netology;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    protected int num = 1;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    protected String localDateTime = LocalDateTime.now().format(formatter);
    private static Logger logger;

    public void log(String msg) {
        System.out.println("[" + localDateTime + " " + num++ + "] " + msg);

    }

    private Logger() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
