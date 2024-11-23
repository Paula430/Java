import exceptions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws AgeLessThanZeroException {
        /* Handling exceptions with try catch block: */
        try {
            checkFile("src/text.tx", 1024);
        } catch (FileException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try{
            checkPassword("fff");
        }catch(PasswordTooShortException e){
            System.err.println("Error: " + e.getMessage());
        }

        tryWithResources();

        /* Handling exceptions with throws keyword: */
        validateAge(-3);

    }

    public static void validateAge(int age) throws AgeLessThanZeroException {
        if (age < 0) {
            throw new AgeLessThanZeroException("Age should be positive.");
        }
    }

    public static void checkFile(String fileName, long maxSize) throws FileException {

        File file = new File(fileName);

        if (!fileName.endsWith(".txt")) {
            throw new FileFormatException("Invalid file format. Only .txt format is available.");
        }

        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + fileName);
        }

        if (file.length() > maxSize) {
            throw new FileTooLargeException("File exceeds maximum size of " + maxSize + "bytes.");
        }

        System.out.println("File is correct.");
    }

    public static void checkPassword(String password) throws PasswordTooShortException{
        if(password.length()<8){
            throw new PasswordTooShortException("Password is too short. Password should have more than 8 letters.");
        }
    }

    public static void tryWithResources() {
        String filePath="src/txt.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

}
