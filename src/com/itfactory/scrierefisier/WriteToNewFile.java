package com.itfactory.scrierefisier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToNewFile {
    public static void main(String[] args) throws IOException {
        String contentToAppend = "Suntem la capitolul 2123\n";
        String fileName = "fisier_nou.txt";
        Path path = Paths.get(fileName);
        Files.write(path, contentToAppend.getBytes());
    }
}
