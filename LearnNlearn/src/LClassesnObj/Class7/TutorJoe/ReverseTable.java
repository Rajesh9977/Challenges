package LClassesnObj.Class7.TutorJoe;

import java.util.Scanner;

public class ReverseTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        for(int i = 10; i>=1; i--){
            System.out.println(i*num);
        }

    }
}
