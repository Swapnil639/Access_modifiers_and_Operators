package com.bridgelabz.forloop;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number:");
        int number=scanner.nextInt();
        int temp=number;
        int rem,rev=0;

        for (int i =temp; i !=0 ; i=i/10) {
            rem=i%10;
            rev=rev*10+rem;
        }
        if (number==rev){
            System.out.println(number+" is Palindrome number");
        }else {
            System.out.println(number+" is not palindrome number");
        }
    }
}
