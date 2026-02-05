package com.multithreading.downloadmanager;

public class DownloadManagerThread {

    public static void main(String[] args) throws InterruptedException {

        // create threads
        FileDownloaderThread t1 =
                new FileDownloaderThread("Document.pdf");
        FileDownloaderThread t2 =
                new FileDownloaderThread("Image.jpg");
        FileDownloaderThread t3 =
                new FileDownloaderThread("Video.mp4");

        // start threads
        t1.start();
        t2.start();
        t3.start();

        // main thread waits for all downloads to finish
        t1.join();
        t2.join();
        t3.join();

        System.out.println("\nAll downloads complete!");
    }
}

