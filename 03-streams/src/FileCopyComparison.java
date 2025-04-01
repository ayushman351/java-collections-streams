import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileCopyComparison {
    
    // Method to copy file using Buffered Streams
    public static void copyFileBuffered(String source, String destination) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {
            
            byte[] buffer = new byte[4096];  // 4 KB buffer
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
    }
    
    // Method to copy file using unbuffered FileInputStream/FileOutputStream
    public static void copyFileUnbuffered(String source, String destination) throws IOException {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {
            
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }
        }
    }

    public static void main(String[] args) {
        String sourceFile = "source.txt";

    } }