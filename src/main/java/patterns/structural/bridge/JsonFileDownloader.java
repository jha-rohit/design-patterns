package main.java.patterns.structural.bridge;

/**
 * Created by rohit.jh on 11/06/19
 */

public class JsonFileDownloader implements Downloader{

    @Override
    public void downloadFile() {
        System.out.println("Downloading json file");
    }
}
