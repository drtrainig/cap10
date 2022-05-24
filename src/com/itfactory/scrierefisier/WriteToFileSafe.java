package com.itfactory.scrierefisier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteToFileSafe {
    public static void main(String[] args) throws IOException {
        String numeFisier = "fisier.txt";
        Path path = Paths.get(numeFisier);
        List<String> primulFisier = Files.readAllLines(path);

        StringBuilder primulFisierString = new StringBuilder();
        for (String line : primulFisier) {
            primulFisierString.append(line).append("\n");
        }
        String numeFisier2 = "Copy " + numeFisier;
        Path path1 = Paths.get(numeFisier2);
        Files.write(path1, primulFisierString.toString().getBytes());
    }
}
