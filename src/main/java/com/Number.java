package com;

import java.util.*;

public class Number {
    public static void main(String[] args) {

        boolean isPresent = false;
        int digit;
        Scanner sc = new Scanner(System.in);
        int sequence = sc.nextInt();

        System.out.println("Enter the sequence");
        int numberToFind = sc.nextInt();

        while (sequence != 0) {
            digit = sequence % 10;
            sequence = sequence / 10;

            if (digit == numberToFind)
                isPresent = true;
        }
        System.out.println(isPresent);
    }
}

