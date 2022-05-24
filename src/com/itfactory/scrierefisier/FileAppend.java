package com.itfactory.scrierefisier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        String contentToAppend = "Spahyhhin\n";
        Path path = Paths.get("append.txt");
        Files.write(path, contentToAppend.getBytes(), StandardOpenOption.APPEND);
    }
}
