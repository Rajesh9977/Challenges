
public class Array2d {
    public static void main(String[] args){

        System.out.println("Welcome to Array");
        int[] numArray = UtilityEnterNumber.inputArray();
        long sum = sum(numArray);
        float average = average(numArray);
        System.out.println("Sum of the number is : "+ sum);
        System.out.println("Average of the number is :"+ average);

    }

    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while (i<numArray.length){
            sum += numArray[i];
            i++;
        }


        return sum;
    }

    public static float average(int[] numArray){
        long sum = sum(numArray);
        return (float) (sum/numArray.length);
    }
}
