package LClassesnObj.Class7.Challenge;

public class fibonacci {
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        int first = 0;
        int second = 1;
        for(int i =0; i<=num;i++){
            System.out.println(first);
            int next = first+second;
            first = second;
            second = next;
        }
    }
}
