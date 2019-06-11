package main.java.patterns.structural.bridge;

/**
 * Created by rohit.jh on 11/06/19
 */
public class MacOS extends OperatingSystem {

    MacOS(Downloader downloader) {
        super(downloader);
    }

    @Override
    void storeFile() {
        System.out.println("Storing file for Mac");
        downloader.downloadFile();
    }
}
