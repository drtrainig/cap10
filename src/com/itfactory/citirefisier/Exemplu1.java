package com.itfactory.citirefisier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exemplu1 {
    public static void main(String[] args)  {
        try {
            Path path = Paths.get("test1.txt");
            System.out.println(path.toAbsolutePath());
            List<String> test1 = Files.readAllLines(path);
            System.out.println(test1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
