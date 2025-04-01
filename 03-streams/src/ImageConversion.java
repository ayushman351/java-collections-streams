import java.io.*;
import java.nio.file.*;

public class ImageConversion {

    // Method to convert an image file to a byte array
    public static byte[] imageToByteArray(String imagePath) throws IOException {
        File file = new File(imagePath);
        byte[] byteArray = new byte[(int) file.length()];

        try (FileInputStream fis = new FileInputStream(file)) {
            fis.read(byteArray);  // Reading the image file into a byte array
        }
        
        return byteArray;
    }

    // Method to write the byte array back to a new image file
    public static void byteArrayToImage(byte[] byteArray, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
             FileOutputStream fos = new FileOutputStream(outputPath)) {
             
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);  // Writing byte array back to file
            }
        }
    }

    public static void main(String[] args) {
        String originalImagePath = "original_image.jpg";  // Path to the original image
        String outputImagePath = "output_image.jpg";  // Path to the new image file

        try {
            // Convert the image to byte array
            byte[] imageBytes = imageToByteArray(originalImagePath);
            System.out.println("Image converted to byte array successfully!");

            // Write the byte array back to a new image file
            byteArrayToImage(imageBytes, outputImagePath);
            System.out.println("Byte array written back to new image file successfully!");

            // Verify the new file is identical to the original
            if (Files.mismatch(Paths.get(originalImagePath), Paths.get(outputImagePath)) == -1) {
                System.out.println("The new image file is identical to the original.");
            } else {
                System.out.println("The new image file is different from the original.");
            }
        } catch (IOException e) {
            System.err.println("Error processing the image files: " + e.getMessage());
        }
    }
}
