package com.tns.Day2;



public class Looping {



	public static void main(String[] args) {

		System.out.println("Do While");

        // do-while loop

        int k = 1;

        do {

            System.out.println("k = " + k);

            k++;

        } while (k <= 5);

        

        // while loop

        System.out.println("While");

        int j = 1;

        while (j <= 5) {

            System.out.println("j = " + j);

            j++;

        }

        

        System.out.println("For");

        // for loop

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);

        }



	}



}