import java.util.Scanner;

public class UtilityEnterNumber {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while(i<size) {
            System.out.println("please Enter your number :" + (i + 1) +":");
            nums[i] = input.nextInt(); // Stores user's number at index i
            i++;
        }
        return nums;
    }



}
