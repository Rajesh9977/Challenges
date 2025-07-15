package Loops;

public class SumOfOdd {
    public static void main(String[] args){
        String word = "HELLORAJ";
        int sum = 0 ;
        for(int i=0; i < word.length();i++){
            char ch = word.charAt(i);
            if(ch != 'A' && ch!='E'&& ch != 'I'&& ch != 'O'&& ch!= 'U'){
                sum++;

            }

        }
        System.out.print(sum);

    }
}
