package LClassesnObj.Class7.TutorJoe;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        int multiple = 1;
        for(int i = num;i>=1;i--){
            multiple = multiple*i;

        }
        System.out.print(multiple);
    }
}
