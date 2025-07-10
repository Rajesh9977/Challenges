package Day3;

public class Contains {
    public static void main(String[] args){
        String check = "ReactDeveloper";
        Boolean a = check.contains("soft");
        boolean b = check.endsWith("v");
        System.out.println(a);
        System.out.println(b);

        System.out.println();
        System.out.println(check.contains("React"));
    }
}
