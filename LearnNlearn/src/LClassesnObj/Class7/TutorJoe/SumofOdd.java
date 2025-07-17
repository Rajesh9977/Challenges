package LClassesnObj.Class7.TutorJoe;

import java.util.Scanner;

public class SumofOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = input.nextInt();
        int sum = 0;
        for(int i = 1;i<=num;i++){
            if(i%2!=0){
                sum += i;

            }
        }
        System.out.print(sum);

    }
}
