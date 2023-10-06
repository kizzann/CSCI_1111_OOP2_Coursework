import java.io.*;
import java.util.Scanner;

public class EncryptDecrypt {
    public static void main(String[] args) throws IOException {
        String fileNameIn = "";
        String fileNameOut = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file to encrypt/decrypt: ");
        fileNameIn = sc.nextLine();
        System.out.println("Enter the file you would like to have outputted: ");
        fileNameOut = sc.nextLine();
        System.out.println("Would you like to 1: encrypt or 2: decrypt file? Please enter 1 or 2");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                encrypt(fileNameIn, fileNameOut);
                break;
            case 2:
                decrypt(fileNameIn, fileNameOut);
                break;
            default: System.out.println("The wrong data has been entered.");
        }


    }
    public static void encrypt(String fileNameIn, String fileNameOut) {
        int buffer = 0;
        try (
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(fileNameOut));
                BufferedInputStream input = new BufferedInputStream(new FileInputStream(fileNameIn));
        ) {
            while((buffer = input.read()) != -1) {
                output.write(buffer + 5);
            }
        }
        catch(IOException ex) {
            System.out.println("The file could not be opened!");
        }
    }
    public static void decrypt(String fileNameIn, String fileNameOut) {
        int buffer = 0;
        try (
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(fileNameOut));
                BufferedInputStream input = new BufferedInputStream(new FileInputStream(fileNameIn));
        ) {
            while((buffer = input.read()) != -1) {
                output.write(buffer - 5);
            }
        }
        catch(IOException ex) {
            System.out.println("The file could not be opened");
        }
    }
}
