package com.denizkaradal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumSquareDifference(10));
        System.out.println(sumSquareDifference(20));
        System.out.println(sumSquareDifference(100));
    }

    private static int sumSquareDifference(int number){
        int sumOfSquares= 0;
        int squareOfSum = 0;

        for (int i = 1; i <= number; i++) {
            sumOfSquares += i * i;
            squareOfSum += i;
        }
        squareOfSum *= squareOfSum;

        return squareOfSum - sumOfSquares;
    }
}
