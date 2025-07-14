package LClassesnObj.Class7.Challenge;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers please : ");
        int a = input.nextInt();
        String result = a % 2 == 0? "EVEN" : "ODD";
        System.out.print("your number is "+ result);
    }


    }