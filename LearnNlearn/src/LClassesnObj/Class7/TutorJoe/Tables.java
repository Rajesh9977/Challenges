package LClassesnObj.Class7.TutorJoe;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number your want table for: ");
        int num = input.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println("5 * "+i+"="+i*num );
        }

    }
}
