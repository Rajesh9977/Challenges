package LClassesnObj.Class7.TutorJoe;

import java.util.Scanner;

public class OddNumb {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int num = input.nextInt();
        for(int i = 1; i<=num; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
