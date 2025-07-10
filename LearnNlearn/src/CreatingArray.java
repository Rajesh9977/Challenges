import java.util.Arrays;
import java.util.Scanner;

public class CreatingArray {
    public static int[] fetchArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements you wants in an Array");
        int size = input.nextInt();
        int[] numbs = new int[size];
        int i = 0;
        while( i < size) {
            System.out.println("Enter the number please : " + (i+1) +":");
            numbs[i] = input.nextInt();
            i++;

        }
        return numbs;

    }

    public static void displayArray(int[] numArray){
        int i =0;
        while(i < numArray.length){
            System.out.println(Arrays.toString(numArray));
            i++;
        }
    }
}
