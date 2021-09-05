/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler  Mozo
 */
/*
Psuedo
ask user for their input with a print statement
assign a scanner(name) to the user's keyboard input(System.in)
print the string along with the required output.
 */
package exercise01;

import java.util.Scanner;

public class solution01 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Hello, "+name +", nice to meet you!");
    }

}
