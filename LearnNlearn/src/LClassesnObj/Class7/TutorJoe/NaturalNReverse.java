package LClassesnObj.Class7.TutorJoe;

import java.util.Scanner;

public class NaturalNReverse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your last number: ");
        int a = input.nextInt();
        System.out.println("Enter your first Number: ");
        int b = input.nextInt();
        int i = a;
        while(i>=b){
            System.out.println(i);
            i--;
        }
    }
}
