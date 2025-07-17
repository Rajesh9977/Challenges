package LClassesnObj.Class7.Challenge;

import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5;
        int guess;
        do{
            System.out.println("Enter your number: ");
            guess = input.nextInt();
        }while(num != guess);
            System.out.print("Thanks you guessed correct");

    }
}
