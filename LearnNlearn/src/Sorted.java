public class Sorted {
    public static void main(String[] args){
        int[] numArr = CreatingArray.fetchArray();
        boolean a = isInc(numArr);
        boolean b = isDec(numArr);
        if (a || b){
            System.out.println("Your array is sorted");

        }else{
            System.out.println("Your array is not sorted");
        }

    }

    public static boolean isInc(int[] numArr){
        int i = 1;
        while(i < numArr.length){
            if(numArr[i] < numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDec(int[] numArr){
        int j = 1;
        while(j < numArr.length){
            if(numArr[j] > numArr[j-1] ){
                return false;
            }
            j++;
        }
        return true;
    }
}
