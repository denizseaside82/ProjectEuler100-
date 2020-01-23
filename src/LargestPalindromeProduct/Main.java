package LargestPalindromeProduct;
/*
Largest palindrome product

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two n-digit numbers.
*/

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(largestPalindrome(99, 99));
        System.out.println(largestPalindrome(999, 999));
    }

    private static long reversed(long number){
        long reserved = 0;
        long reduced;

        while (number > 0){
            reduced = number % 10;
            reserved = (reserved * 10) + reduced;
            number /= 10;
        }

        return reserved;
    }

    private static boolean isPalindrome(long number){
        return reversed(number) == number;
    }

    private static long largestPalindrome(long number1, long number2){
        long result = 0;
        long largest = 0;

        for (long i = number1; i >= 0; i--){
            for (long j = number2; j >= 0; j--){
                result = j * i;
                if(isPalindrome(result)){
                    largest = Math.max(largest, result);

                }
            }
        }
        return largest;
    }
}
