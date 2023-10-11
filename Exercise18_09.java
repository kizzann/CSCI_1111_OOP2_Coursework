import java.util.Scanner;

public class Exercise18_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String value = input.nextLine();

        reverseDisplay(value);

    }
    public static void reverseDisplay(String value) throws StringIndexOutOfBoundsException {
        if((value.length() == 0)) {
            System.out.println(value);
        } else {
            System.out.print(value.charAt(value.length() - 1));
            reverseDisplay(value.substring(0, value.length() - 1));

        }
    }
}
