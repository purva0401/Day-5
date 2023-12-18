package BasicCorePrograms;

import java.util.Scanner;

public class ComputeQutioentRemender {
    private static Scanner sc;

    public static void main(String[] args) {
            int num1, num2, quotient, remainder;
            sc = new Scanner(System.in);

            System.out.print("Enter the First Value =  ");
            num1 = sc.nextInt();

            System.out.print("Enter the Second Value = ");
            num2 = sc.nextInt();

            quotient = num1 / num2;
            remainder = num1 % num2;

            System.out.printf("\nQuotient of %d and %d = %d", num1, num2, quotient);
            System.out.printf("\nRemainder of %d and %d = %d", num1, num2, remainder);
        }
}
