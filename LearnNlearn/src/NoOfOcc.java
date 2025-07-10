import java.util.Scanner;

public class NoOfOcc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numArr = UtilityEnterNumber.inputArray();
        System.out.println("Enter number you want to find : ");
        int num = input.nextInt();
        int occurrences = noOfOccrrences(numArr, num);
        System.out.println(occurrences);



    }

    public static int noOfOccrrences(int[] numArr, int num){
        int occ = 0;
        int i = 0;
        while(i< numArr.length){
            if (numArr[i] == num){
                occ++;
            }
            i++;
        }
        return occ;


    }

}
