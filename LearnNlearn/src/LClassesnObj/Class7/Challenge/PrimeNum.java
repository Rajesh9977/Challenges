package LClassesnObj.Class7.Challenge;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number Please: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        System.out.println("your number is " + (isPrime(num) ? "Prime" : "Not Prime"));

    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
