import java.io.*;

public class Exercise17_07 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Loan loan1 = new Loan();
        Loan loan2 = new Loan(1.8, 10, 10000);

        try (
                ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Exercise 17_07.dat")));
        ) {
            output.writeObject(loan1);
            output.writeObject(loan2);
        }
        try (
                ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Exercise 17_07.dat")));
                ) {
            while(true) {
                Loan loan = (Loan) input.readObject();
                System.out.println("Total loan amount:" + loan.getLoanAmount());
                System.out.println();
            }
        }
        catch (EOFException | ClassNotFoundException ex) {
            System.out.println("End of file");
        }
    }
}

