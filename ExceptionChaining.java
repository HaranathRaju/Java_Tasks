import java.io.*;

public class ExceptionChaining {
    static void readFile() throws Exception {
        try {
            throw new IOException("File not found while reading");
        } catch (IOException e) {
            throw new Exception("Error occurred while processing file", e);
        }
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Original Cause: " + e.getCause());
        }
    }
}