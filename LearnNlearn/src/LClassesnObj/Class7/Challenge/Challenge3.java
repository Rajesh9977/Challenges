package LClassesnObj.Class7.Challenge;

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number here: ");
        int num = input.nextInt();
        int reverse = 0;
        for(;num!=0;num = num/10){
            int digit = num %10;
            reverse = reverse*10 + digit;
        }
        System.out.print(reverse);


    }
}
