package Day2;

public class UseMarker {
    public static void main(String[] args) {
        Marker marker1 = new Marker();
        marker1.price = 100;
        marker1.weight = 10;
        marker1.color = "Blue";
        marker1.isQuality = true;
        System.out.println("Price : " + marker1.price + " Weight : "+marker1.weight + " Color : "+ marker1.color);

        Marker marker2 = new Marker();
        marker2.price = 120;
        marker2.weight = 20;
        marker2.color = "Pink";
        marker2.isQuality = false;
        System.out.println("Price : "+ marker2.price + " Weight : "+ marker2.weight + " Color : "+marker2.color);

    }

}


class Marker{
    int price;
    String color;
    float weight;
    boolean isQuality;
}