public class ReverseNum {
    public static void main(String[] args){
        int[] arr = CreatingArray.fetchArray();
        reverse(arr);
        CreatingArray.displayArray(arr);

    }
    public static void reverse(int[] arr){
        int i = 0;
        while(i < arr.length/2){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1)-i] = swap;
            i++;
        }
    }
}
