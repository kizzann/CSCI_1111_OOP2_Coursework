import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        int limit = 100;

        PrintWriter output = new PrintWriter(new FileOutputStream("Exercise 17_01", true));


        for(int i = 0; i < limit; i ++) {
            output.print((int)(Math.random() * limit) + " ");
        }
        output.close();

    }
}
