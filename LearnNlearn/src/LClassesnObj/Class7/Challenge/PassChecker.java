package LClassesnObj.Class7.Challenge;

import java.util.Scanner;

public class PassChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        do{
            System.out.println("please enter your password: ");
            password = input.next();
        }while(!isCorrect(password));
        System.out.print("Thanks for your correct password:");

    }
    public static boolean isCorrect(String password){
        return password.length()>6;
    }
}
