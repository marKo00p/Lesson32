package com;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[4];
        boolean result = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {

            if(array[i] == array[array.length - 1 - i]) {
                result = true;
            } else {
                result = false;
            }
        }
        System.out.println(result);
    }
}
