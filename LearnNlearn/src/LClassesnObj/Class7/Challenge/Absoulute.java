package LClassesnObj.Class7.Challenge;

import java.util.Scanner;

public class Absoulute {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = input.nextInt();
        int result = num >=0?num:-num;
        System.out.print(result);


    }
}
