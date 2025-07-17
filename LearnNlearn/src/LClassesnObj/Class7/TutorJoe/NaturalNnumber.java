package LClassesnObj.Class7.TutorJoe;

import java.util.Scanner;

public class NaturalNnumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int a = input.nextInt();
        System.out.println("Enter your second number: ");
        int b = input.nextInt();
        for(int i = a; i<=b;i++){
            System.out.println(i);
        }

    }
}
