package org.Vorlesungen.DesignPattern.DecoratorPattern.FileDecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class TestSteuerung {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Lars\\IdeaProjects\\Semester2\\src\\main\\java\\org\\Vorlesungen\\DesignPattern\\DecoratorPattern\\FileDecorator\\TestFile";
        String filePathZip = "C:\\Users\\Lars\\IdeaProjects\\Semester2\\src\\main\\java\\org\\Vorlesungen\\DesignPattern\\DecoratorPattern\\FileDecorator\\TestFile.zip";
        InputStream inputStream1 = new FileInputStream(filePath);
        BufferedInputStream bufferedInputStream1 = new BufferedInputStream(inputStream1);

        InputStream inputStream = new FileInputStream(filePathZip);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ZipInputStream zipInputStream = new ZipInputStream(bufferedInputStream);
        ZipEntry ze;
        while((ze = zipInputStream.getNextEntry()) != null) {
            System.out.printf("Name: %s, FileSize: %s",ze.getName(),ze.getSize());
        }
    }
}
