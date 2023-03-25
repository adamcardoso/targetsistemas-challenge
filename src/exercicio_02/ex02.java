package exercicio_02;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        sc.close();

        boolean valueFound = checkIfBelongsToFibonacciSequence(num);

        if (valueFound) {
            System.out.println(num + " belongs to the Fibonacci sequence.");
        } else {
            System.out.println(num + " does not belong to the Fibonacci sequence.");
        }
    }

    public static boolean checkIfBelongsToFibonacciSequence(int num) {
        int first = 0;
        int second = 1;
        int third = 0;

        while (third <= num) {
            if (third == num) {
                return true;
            }
            third = first + second;
            first = second;
            second = third;
        }

        return false;
    }
}
