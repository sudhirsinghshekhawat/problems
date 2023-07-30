package com.leetcode.problems;

import java.util.Scanner;

public class CheckNumberIsEvenUsingBitwise {

    public boolean isOdd(int number) {
        return (number & 1) != 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check Even or Odd : ");
        int number = scanner.nextInt();

        CheckNumberIsEvenUsingBitwise chk = new CheckNumberIsEvenUsingBitwise();
        if (chk.isOdd(number))
            System.out.println("Number is odd");
        else
            System.out.println("Number is even number");
    }

}
