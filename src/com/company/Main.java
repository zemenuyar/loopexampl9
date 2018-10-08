package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        int num;
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        num = keyboard.nextInt();
        int i = 0;
        int securet=5;

        while (num!=securet){
            System.out.println("try agian");
            num = keyboard.nextInt();
            System.out.println(num);
        }

        System.out.println("You won!");

    }
}
