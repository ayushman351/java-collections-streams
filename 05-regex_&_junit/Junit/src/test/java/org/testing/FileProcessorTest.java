package org.testing;

import org.testing.file_handling.FileProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FileProcessorTest {
    private String fileName = "src/test/java/org/testing/info.txt";
    @Test
    public void testReadWrite() {
        String content = "hello there! how are you?";
        FileProcessor.writeToFile(fileName, content);

        Assertions.assertEquals(content, FileProcessor.readFromFile(fileName));
    }

    @Test
    public void testThrow(){
        Assertions.assertThrows(RuntimeException.class, () -> FileProcessor.readFromFile(""));
    }
}
