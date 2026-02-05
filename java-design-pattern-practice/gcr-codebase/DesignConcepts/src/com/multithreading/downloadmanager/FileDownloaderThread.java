package com.multithreading.downloadmanager;

class FileDownloaderThread extends Thread {

    private String fileName;

    // constructor
    public FileDownloaderThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {

        // simulate download from 0% to 100%
        for (int i = 0; i <= 100; i += 25) {
            System.out.println("[" + Thread.currentThread().getName() +
                    "] Downloading " + fileName + ": " + i + "%");

            try {
                // random delay to simulate real download
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

