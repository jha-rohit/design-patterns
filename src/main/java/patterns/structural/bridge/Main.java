package main.java.patterns.structural.bridge;

/**
 * Created by rohit.jh on 11/06/19
 */

public class Main {
    public static void main(String[] args) {

        XmlFileDownloader xmlFileDownloader = new XmlFileDownloader();
        JsonFileDownloader jsonFileDownloader = new JsonFileDownloader();

        OperatingSystem linuxOS = new LinuxOS(xmlFileDownloader);
        OperatingSystem macOS = new MacOS(xmlFileDownloader);

        linuxOS.storeFile();
        macOS.storeFile();

        linuxOS.downloader = jsonFileDownloader;
        linuxOS.storeFile();

        macOS.downloader = jsonFileDownloader;
        macOS.storeFile();

    }
}
