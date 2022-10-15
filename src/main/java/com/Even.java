package com;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countEven = 0;
        int countOdd = 0;
        int[] number = new int[4];

        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < number.length; i++) {
            if ((number[i] & 1) == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        int result = countEven > countOdd ? 1 : countEven < countOdd ? -1 : 0;
        System.out.println(result);
    }
}
