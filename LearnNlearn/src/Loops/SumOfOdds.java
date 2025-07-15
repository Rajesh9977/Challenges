package Loops;

public class SumOfOdds {
    public static void main(String[] args) {
        String word = "fan";
        char con;
        String sum = "";
        for(int i = 0; i<word.length(); i++){
            con = word.charAt(i);
            sum = sum+String.valueOf(con);
            System.out.println(sum);

        }
    }
}
