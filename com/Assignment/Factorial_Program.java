package com.Assignment;

import java.util.Scanner;

public class Factorial_Program {
    private static long solve(int n) {
        if (n == 0) {
            return 1;
        }
        return (long)n * solve(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Enter a number: ");
            int n = scanner.nextInt();
            long ans = solve(n);
            System.out.println("Factorial of " + n + " is " + ans);
            System.out.println("Do you want to calculate the factorial of another number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        scanner.close();
    }
}