package LClassesnObj.Class7.TutorJoe;

import java.util.Scanner;

public class Power {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int base = input.nextInt();
        System.out.println("Enter the power: ");
        int power = input.nextInt();
        int total = 1;
        for(int i = 1; i<=power;i++){
            total = total*base;

        }
        System.out.println(total);
    }
}
