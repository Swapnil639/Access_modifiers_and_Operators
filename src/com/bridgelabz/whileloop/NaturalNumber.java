package com.bridgelabz.whileloop;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = scanner.nextInt();
        int sum=0;
        while (number>0){
            sum +=number;
            number--;
        }
        System.out.println(sum);

    }
}
