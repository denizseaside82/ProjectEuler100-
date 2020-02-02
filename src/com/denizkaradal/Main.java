package com.denizkaradal;

import java.util.ArrayList;
/*
Problem 7: 10001st prime
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the nth prime number?
*/
public class Main {

    public static void main(String[] args) {
        System.out.println(findNthPrimeNumber(6, primeNumbers()));
        System.out.println(findNthPrimeNumber(10, primeNumbers()));
        System.out.println(findNthPrimeNumber(100, primeNumbers()));
        System.out.println(findNthPrimeNumber(1000, primeNumbers()));
        System.out.println(findNthPrimeNumber(10001, primeNumbers()));
    }

    private static int findNthPrimeNumber(int nthNumber, ArrayList<Integer> primeNumbers){
        return primeNumbers.get(nthNumber - 1);
    }

    private static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    private static ArrayList<Integer> primeNumbers(){
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= 104743; i++) {
            if(isPrime(i)){
                primeList.add(i);
            }
        }
        return primeList;
    }
}
