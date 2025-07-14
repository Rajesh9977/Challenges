package LClassesnObj.Class7.Challenge;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number please");
        int a = input.nextInt();
        int b = input.nextInt();
        int min = a<b?a:b;
        System.out.println(min);
    }
}
