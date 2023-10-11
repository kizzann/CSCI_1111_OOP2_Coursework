import java.util.Scanner;

public class Fundamental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int n1 = input.nextInt();
        System.out.println("Enter the second integer: ");
        int n2 = input.nextInt();

        System.out.println(findGCD(n1, n2));

    }
    private static int findGCD(int n1, int n2) {
        int gcd = 1;
        if(n1 % n2 == 0) {
            return gcd = n2;
        }
        else{
            return findGCD(n2, n1 % n2);
        }
    }
}
