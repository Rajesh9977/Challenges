package Day1Basic;

public class UseShirt{
    public static void main(String[] args){
        Shirt shirt1 = new Shirt();
        shirt1.brand = "wipro";
        shirt1.price = 1500;
        shirt1.fabric = "cotton";
        shirt1.size = 'A';
        shirt1.isChecked = true;
        shirt1.disPerc = 15;
        shirt1.netPrice = (shirt1.price* shirt1.disPerc)/100;
        System.out.println("Brand : "+shirt1.brand + " price : "+shirt1.price + " fabric : "+ shirt1.fabric + " size"+ shirt1.size + " netprice : "+shirt1.netPrice);
        System.out.println();


        Shirt shirt2 = new Shirt();
        shirt2.brand = "tata";
        shirt2.price = 1400;
        shirt2.fabric = "cotton";
        shirt2.size = 'A';
        shirt2.isChecked = true;
        shirt2.disPerc = 15;
        shirt2.netPrice = (shirt2.price* shirt2.disPerc)/100;
        System.out.println("Brand : "+shirt2.brand + " price : "+shirt2.price + " fabric : "+ shirt2.fabric + " size"+ shirt2.size + " netprice : "+shirt2.netPrice);
        System.out.println();


        Shirt shirt3 = new Shirt();
        shirt3.brand = "mahendra";
        shirt3.price = 1300;
        shirt3.fabric = "cotton";
        shirt3.size = 'A';
        shirt3.isChecked = true;
        shirt3.disPerc = 15;
        shirt3.netPrice = (shirt3.price* shirt3.disPerc)/100;
        System.out.println("Brand : "+shirt3.brand + " price : "+shirt3.price + " fabric : "+ shirt3.fabric + " size"+ shirt3.size + " netprice : "+shirt3.netPrice);
        System.out.println();





    }
}

class Shirt {
    String brand;
    int price;
    char size;
    String fabric;
    boolean isChecked;
    int disPerc;
    int netPrice;


}


