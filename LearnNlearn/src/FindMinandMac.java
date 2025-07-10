/*This program tells the maximum number and minimum number of an array.
so for the we have already written code for array we just need to find the max number and minimum number.
 */

import java.util.Scanner;

public class FindMinandMac {
    public static void main(String[] args){
        int[] numArr = CreatingArray.fetchArray();
        int a = Max(numArr);
        int b = min(numArr);
        System.out.println("Your max value is : "+a);
        System.out.println("Your min value is :"+b);

    }

    public static int Max(int[] numArr){
        if(numArr.length ==0){
            return Integer.MIN_VALUE;
        }
        int max = numArr[0];
        int i = 1;
        while (i < numArr.length){
            if (max<numArr[i]){
                max = numArr[i];
            }
            i++;
        }
        return max;
    }
    public static int min(int[] numArr){
        int minimum = numArr[0];
        int j = 0;
        while(j < numArr.length){
            if (minimum > numArr[j]){
                minimum = numArr[j];
            }
            j++;
        }
        return minimum;
    }
}
