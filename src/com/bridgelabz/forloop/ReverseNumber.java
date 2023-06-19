package com.bridgelabz.forloop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number:");
        int number=scanner.nextInt();
        int rem,rev=0;

        for (int i =number; i !=0 ; i=i/10) {
            rem=i%10;
            rev=rev*10+rem;
        }
        System.out.println("Reverse number is "+rev);
    }
}
