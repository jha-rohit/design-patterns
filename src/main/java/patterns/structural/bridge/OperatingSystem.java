package main.java.patterns.structural.bridge;

/**
 * Created by rohit.jh on 11/06/19
 */
public abstract class OperatingSystem {
    Downloader downloader;

    OperatingSystem(Downloader downloader) {
        this.downloader = downloader;
    }

    abstract void storeFile();
}
