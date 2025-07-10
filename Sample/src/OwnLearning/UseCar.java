package OwnLearning;

public class UseCar {
    public static void main(String[] args){
        //classname variable = new classname();

        Car car1 = new Car();
        car1.brand = "Tata";
        car1.price = 10000;
        car1.taxpercentage = 10;
        car1.percentage = (car1.price * car1.taxpercentage)/100;
        car1.netprice = car1.percentage + car1.price;
        car1.color = "Royal Blue";
        System.out.println("Car1 " + "brand = "+car1.brand + ", Price = " + car1.price + ", netprice = "+car1.netprice + ", color = " + car1.color);


        Car car2 = new Car();
        //clasname variable = new classname();

        car2.brand = "bmw";
        car2.price = 15000;
        car2.taxpercentage = 10;
        car2.percentage = (car2.price* car2.taxpercentage)/100 ;
        car2.netprice = car2.price+car2.percentage;
        car2.color  = "black";
        System.out.println("Car2" + " brand = "+car2.brand + ", price = "+ car2.price + ", netprice = "+ car2.netprice + ", color "+ car2.color);


        Car car3 = new Car();
        //classname variable name = new classname();
        car3.brand = "audi";
        car3.price = 15000;
        car3.taxpercentage = 10;
        car3.percentage = (car3.price* car3.taxpercentage)/100 ;
        car3.netprice = car3.price+car3.percentage;
        car3.color  = "red";
        System.out.println("Car3 "+ "brand = "+car3.brand + ", price = "+car3.price + ", netprice = "+car3.netprice + ", color = "+ car3.color);









    }
}



class Car{
    String brand;
    int price;
    int taxpercentage;  //10
    int netprice;
    int percentage;
    String color;

}
