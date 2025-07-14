package LClassesnObj;

import java.util.Scanner;

public class LSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number here between 1 to 7: ");
        int num = input.nextInt();
        switch (num){
            case 1:
                System.out.println( "Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            default:
                System.out.print("Invalid");

        }
    }
}
