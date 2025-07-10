package Loops;

public class LForLoop {
    public static void main(String[] args){
        for(int i = 0; i<=5; i++){
            System.out.println(i);
        }
        System.out.println();

        for(int j = 5; j>=0; j--){
            System.out.println(j);
        }

        for(int k = 0; k <= 3; k++){
            for(int l=0; l<=2; l++){
                System.out.println("k "+k+" l " +l );
            }
        }
    }
}
