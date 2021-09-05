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
