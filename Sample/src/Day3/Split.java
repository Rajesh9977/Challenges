package Day3;

public class Split {
    public static void main(String[] args){
        String a = "Java,Python,C++";
        String[] b = a.split(",");
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        int c = b[0].length();
        int d = b[1].length();
        int e = b[2].length();
        String f = b[0].toLowerCase();
        String g = b[1].toUpperCase();

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }
}
