package Day3;

public class UseLaptop {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop();
        lap1.brand = "Mac";
        lap1.isWarranty = true;
        lap1.color = "Grey";
        lap1.price = 80000;

        System.out.println("Brand name in uppercase : " + lap1.brand.toUpperCase());
        System.out.println("the length of brand is : "+ lap1.brand.length());
        System.out.println(lap1.brand.startsWith("M"));
        char[] a = lap1.brand.toCharArray();
        System.out.println(a[a.length-2]);

    }
}

class Laptop{
    String brand;
    int price;
    String color;
    boolean isWarranty;
}
