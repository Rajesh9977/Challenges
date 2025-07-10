import java.util.Scanner;

public class FindNoOfOccs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numArr = CreatingArray.fetchArray();
        System.out.println("Enter the number you want to find occ: ");
        int numb = input.nextInt();
        int Occurancess = findNoOfOcc(numArr, numb);
        System.out.println(Occurancess);

    }

    public static int findNoOfOcc(int[] numArr ,int numb){
        int occ = 0;
        int i =0;
        while(i<numArr.length){
            if(numArr[i] == numb){
                occ++;
            }
            i++;
        }
        return occ;

    }
}


