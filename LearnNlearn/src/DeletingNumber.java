import java.util.Scanner;

public class DeletingNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numArr = CreatingArray.fetchArray();
        System.out.println("Enter the number you want to delete: ");
        int num = input.nextInt();
        int[] newArr = checkOcc(numArr, num);
        System.out.println("Here is your new Array : ");
        CreatingArray.displayArray(newArr);


    }

    public static int[] checkOcc(int[] numArr, int num){
        int occ = NoOfOcc.noOfOccrrences(numArr, num);
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];
        int i = 0, j = 0;
        while(i<numArr.length){
            if(numArr[i] != num){
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }

        return newArr;


    }

}
