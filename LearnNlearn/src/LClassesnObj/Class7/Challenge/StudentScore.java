package LClassesnObj.Class7.Challenge;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        String result = num > 80 ? "High" : (num > 50 ? "moderate":"low");
        System.out.print(result);
    }
}
