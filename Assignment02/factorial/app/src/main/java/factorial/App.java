package factorial;

import java.util.Scanner;

public class FactorialFibonacci {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            System.out.println(i + "! = " + result);
        }
        return result;
    }

    public static int fibonacci(int n) {
        int f0 = 0, f1 = 1;
        if (n == 0) {
            System.out.println("f0 = " + f0);
            return f0;
        }
        System.out.println("f0 = " + f0);
        System.out.println("f1 = " + f1);
        for (int i = 2; i <= n; i++) {
            int f2 = f0 + f1;
            System.out.println("f" + i + " = " + f2);
            f0 = f1;
            f1 = f2;
        }
        return f1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number for calculate: ");
            int num = scanner.nextInt();
            if (num < 0 || num > 99) {
                System.out.println("Number out of range 0-99");
                break;
            }
            System.out.println("Calculation " + num + " Factorial");
            int factResult = factorial(num);

            System.out.println("Calculation Fibonacci number " + num);
            int fibResult = fibonacci(num);

            System.out.println(num + " Factorial minus Fibonacci number " + num + " is " + (factResult - fibResult));
        }
        scanner.close();
    }
}
