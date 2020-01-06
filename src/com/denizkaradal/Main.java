package com.denizkaradal;
/*
Project Euler: Problem 1: Multiples of 3 and 5
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below the provided parameter value number.
 */

public class Main {

    public static void main(String[] args) {
        // write your code here
        multiplesof3Of5(10);
        multiplesof3Of5(1000);
        multiplesof3Of5(49);
        multiplesof3Of5(19564);
        multiplesof3Of5(8456);
    }

    private static void multiplesof3Of5(int number){
        int temp = 0;

        for (int i = 0; i < number; i++) {
            if(i % 3 == 0 || i % 5 == 0){
                temp += i;
            }
        }

        System.out.println(temp);
    }
}
