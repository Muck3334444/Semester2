package org.Vorlesungen.ExeptionHandeling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExeption {
    public static void main(String[] args) {
        try{
            readFile();
        }catch (FileNotFoundException e) {
            System.out.println("Überraschender weise wurde kein File gefunden");
        }
    }

    public static void readFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("Ich bin kein FilePath");
    }
}
