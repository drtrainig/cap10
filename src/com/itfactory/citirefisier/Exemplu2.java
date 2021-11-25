package com.itfactory.citirefisier;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu2 {
    public static void main(String[] args) {
        try {
            //Daca cititi fisierul din alta locatie fata de proiect utilizati toata adresa ca la curs
            Path path = Paths.get("C:\\Users\\dragos\\Documents\\untitled\\src\\test.txt");
            BufferedReader reader = Files.newBufferedReader(path);
            String line;
            while ( (line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
