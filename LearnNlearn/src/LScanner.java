import java.util.Scanner;

public class LScanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of a ");
        int a = input.nextInt();
        System.out.println("Enter value of b");
        int b = input.nextInt();
        System.out.println("Enter value of c");
        int c = input.nextInt();

        System.out.println("The sum of three numbers is : "+(a+b+c));

    }
}
