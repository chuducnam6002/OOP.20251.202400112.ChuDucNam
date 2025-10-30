package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "test.txt"; 
        byte[] inputBytes = null;
        
        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            System.err.println("Error: File not found or unreadable: " + filename);
            e.printStackTrace();
            return;
        }

        long start = System.currentTimeMillis();
        String outputString = ""; 
        
        for (byte b : inputBytes) {
            outputString += (char)b; 
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken (GarbageCreator, using '+'): " + (end - start) + " ms");
    }
}