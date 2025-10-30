package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
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
        
        StringBuffer outputBuffer = new StringBuffer(); 
        
        for (byte b : inputBytes) {
            outputBuffer.append((char)b); 
        }

        String outputString = outputBuffer.toString(); 
        
        long end = System.currentTimeMillis();
        System.out.println("Time taken (NoGarbage, using StringBuffer): " + (end - start) + " ms");
    }
}
