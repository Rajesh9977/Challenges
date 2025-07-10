package Day3;

public class UsePen {
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.price = 100;
        pen1.brand = "sonny";
        pen1.color = "Blue";

        Pen pen2 = new Pen();
        pen2.price = 200;
        pen2.brand = "cello";
        pen2.color = "blue";

        System.out.println(pen1.brand.toUpperCase());
        System.out.println(pen2.brand.toUpperCase());
        System.out.println(pen1.brand.equals("blue"));
        System.out.println(pen2.brand.equals("black"));
        System.out.println(pen2.brand.charAt(4));



    }
}

class Pen{
    String brand;
    int price;
    String color;
}
