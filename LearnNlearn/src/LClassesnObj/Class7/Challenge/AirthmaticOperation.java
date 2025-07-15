package LClassesnObj.Class7.Challenge;

import java.util.Scanner;

public class AirthmaticOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        String opr = input.next();
        int result = switch (opr){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            default -> -1;
        };
        System.out.print(result);
    }




}
