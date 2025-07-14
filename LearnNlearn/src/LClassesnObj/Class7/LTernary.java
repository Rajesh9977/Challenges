package LClassesnObj.Class7;

import java.util.Scanner;

public class LTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number Please");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int greatestNumber = num1 > num2? num1 : num2;
        System.out.println(greatestNumber);

    }
}
