package com.Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class File_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "myFile.txt";
        File file = new File(path);

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + path);
                System.out.println("Enter the data you want to enter in the file:");
                String data = scanner.nextLine();
                FileWriter writer = new FileWriter(path);
                writer.write(data);
                writer.close();
                System.out.println("Data written to the file successfully!");
            }
        } catch (IOException e) {
            System.out.println("Error writing to the file");
            e.printStackTrace();
            return;
        }
        
        Map<String, Integer> frequency = new HashMap<>();

        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNext()) {
                String word = fileScanner.next().toLowerCase();
                word = word.replaceAll("[^a-zA-Z]", "");
                if (!word.isEmpty()) {
                    frequency.put(word, frequency.getOrDefault(word, 0) + 1);
                }
            }
            fileScanner.close();

            System.out.println("Word Frequencies:");
            for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading the file");
            e.printStackTrace();
        }
        scanner.close();
    }
}
