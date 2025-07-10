package Day2;

public class UsePen{
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.brand = "Retro";
        pen1.tipwidth = 0.25f;
        pen1.color = "black";
        pen1.price = 123;

        System.out.println("Price : "+ pen1.price + " tipwidth : "+pen1.tipwidth +" color : "+pen1.color);


    }
}


class Pen {
    String brand;
    int price;
    float tipwidth;
    String color;
}










