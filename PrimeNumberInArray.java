package com.practice;

public class PrimeNumberInArray {
    public static void main(String[] args) {
        int[] arr = {15, 7, 4, 12, 5, 22, 9};

        for (int i = 0; i < arr.length - 1; i++) {
            boolean isPrime = true;

            for (int j = 2; j < arr[i]; j++) {

                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }


                if (isPrime) {
                    System.out.println(arr[i] + " are the prime numbers in the array ");
                }

            }
        }
    }

