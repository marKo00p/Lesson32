package com;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 1){
            factorial *= n--;
        }
        System.out.println(factorial);

    }
}
