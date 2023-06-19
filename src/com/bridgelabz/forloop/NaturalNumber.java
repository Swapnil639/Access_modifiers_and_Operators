package com.bridgelabz.forloop;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
