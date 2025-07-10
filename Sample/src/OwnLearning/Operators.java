package OwnLearning;

public class Operators {
    public static void main(String[] args){
        int a = 10;
        int b = 3;
        int c = 4;
        int h = a + b;
        System.out.println("Addition: "+h);
        int d = a-b;
        System.out.println("Subtraction: "+d);
        int e = a*b;
        System.out.println("Multiplication: "+e);
        int f = a/b;
        System.out.println("Division: "+f);
        int g = a%b;
        System.out.println("Modulus: "+g);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println();
        System.out.println(a>b && a>c); //true
        System.out.println(b>c && b>c); //false
        System.out.println(c>a && c>a); //false
        System.out.println(a>b || a>c); //true
        System.out.println(b>a || b>c); //false
        System.out.println(c>a || c>b); //true
    }
}
