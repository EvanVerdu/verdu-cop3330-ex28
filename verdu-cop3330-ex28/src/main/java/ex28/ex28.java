package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class ex28 {

    public static void main(String[] Args){

        int total = 0;

        Scanner scanner = new Scanner(System.in);
        String[] value = {"0","0","0","0","0"};
        int[] Value = {0,0,0,0,0};

        for (int i=0; i<5; i++){
            System.out.print("Enter a number: ");
            value[i] = scanner.nextLine();
            Value[i] = Integer.parseInt(value[i]);
        }

        for (int i=0; i<5; i++){
            total += Value[i];
        }

        System.out.print("The total is " + total + ".");

    }

    
}
