package main.java.patterns.structural.bridge;

/**
 * Created by rohit.jh on 11/06/19
 */

public class LinuxOS extends OperatingSystem {

    LinuxOS(Downloader downloader) {
        super(downloader);
    }

    @Override
    void storeFile() {
        System.out.println("Storing file for linux");
        downloader.downloadFile();
    }
}
