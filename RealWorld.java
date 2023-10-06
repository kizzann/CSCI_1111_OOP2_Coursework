import java.io.*;
import java.util.Scanner;

public class RealWorld {
    public static void main(String[] args) throws IOException {
        int limit = 100;

        PrintWriter output = new PrintWriter(new FileOutputStream("Exercise 17_01", true));


        for(int i = 0; i < limit; i ++) {
            output.print((int)(Math.random() * limit) + " ");
        }
        output.close();
        fileReader();
    }
    public static void fileReader() throws IOException {
        FileInputStream input = new FileInputStream("Exercise 17_01");
        int sum = 0;
        int value = 0;

        while((value = input.read()) != -1)
            sum += value;

        System.out.println(sum);
    }
}
