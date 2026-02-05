package com.multithreading.downloadmanager;

public class DownloadManagerRunnable {

    public static void main(String[] args) throws InterruptedException {

        // create runnable objects
        Runnable r1 =
                new FileDownloaderRunnable("Document.pdf");
        Runnable r2 =
                new FileDownloaderRunnable("Image.jpg");
        Runnable r3 =
                new FileDownloaderRunnable("Video.mp4");

        // create thread objects
        Thread t1 = new Thread(r1, "Thread-1");
        Thread t2 = new Thread(r2, "Thread-2");
        Thread t3 = new Thread(r3, "Thread-3");

        // start threads
        t1.start();
        t2.start();
        t3.start();

        // wait for completion
        t1.join();
        t2.join();
        t3.join();

        System.out.println("\nAll downloads complete!");
    }
}

