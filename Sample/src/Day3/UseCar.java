package Day3;

public class UseCar {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.brand = "Tata";
        car1.model = "XVI";
        car1.price = 300000;
        car1.isPetrol = true;


        Car car2 = new Car();
        car2.brand = "BMW";
        car2.model = "IX";
        car2.price = 400000;
        car2.isPetrol = false;

        System.out.println("The first brand name is " + car1.brand + " and length is "+ car1.brand.length());
        System.out.println("The first brand name is " + car2.brand + " and length is "+ car2.brand.length());
        System.out.println("The total price of two cars is : "+ (car1.price+car2.price));
    }
}

class Car{
    String brand;
    String model;
    int price;
    boolean isPetrol;
}
