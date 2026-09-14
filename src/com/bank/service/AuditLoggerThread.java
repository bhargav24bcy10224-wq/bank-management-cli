package com.bank.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class AuditLoggerThread extends Thread {
    private final String msg;
    private static final Object LOCK = new Object();

    public AuditLoggerThread(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        synchronized (LOCK) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("audit_log.txt", true))) {
                bw.write(LocalDateTime.now() + " : " + msg);
                bw.newLine();
            } catch (IOException e) {
                System.err.println("Logging error: " + e.getMessage());
            }
        }
    }
}
