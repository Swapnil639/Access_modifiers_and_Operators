package com.bridgelabz.operator;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number:");
        int m = scanner.nextInt();
        System.out.println("Enter date:");
        int d = scanner.nextInt();

        boolean isSpring = (m == 3 && d == 21 || d == 31 &&
                m == 4 && d == 1 || d == 30 &&
                m == 5 && d == 1 || d == 31 &&
                m == 6 && d == 1 || d == 21);

        System.out.println(isSpring);
    }
}
