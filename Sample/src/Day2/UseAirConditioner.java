package Day2;

public class UseAirConditioner {
    public static void main(String[] args){
        Airconditioner airCond1 = new Airconditioner();
        airCond1.brand = "Wipro";
        airCond1.price = 45000;
        airCond1.noOfWings = 4;
        airCond1.isQuality = true;
        System.out.println("We have a very good brand air conditioner details given below");
        System.out.println("Brand : " + airCond1.brand);
        System.out.println("Price : "+ airCond1.price);
        System.out.println("Wings : "+ airCond1.noOfWings);
        System.out.println("Quality (True/False) :"+ airCond1.isQuality);
        System.out.println();


        Airconditioner airCond2 = new Airconditioner();
        airCond2.brand = "Tata";
        airCond2.price = 48000;
        airCond2.noOfWings = 4;
        airCond2.isQuality = true;
        System.out.println("We have a very good brand air conditioner details given below");
        System.out.println("Brand : " + airCond2.brand);
        System.out.println("Price : "+ airCond2.price);
        System.out.println("Wings : "+ airCond2.noOfWings);
        System.out.println("Quality (True/False) :"+ airCond2.isQuality);

    }
}

class Airconditioner{
    String brand;
    int price;
    int noOfWings;
    Boolean isQuality;

}