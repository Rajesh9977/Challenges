package Day3;

public class UseHospital {
    public static void main(String[] args){
        Hospital hos1 = new Hospital();
        hos1.name = "Apollo";
        hos1.location = "Chennai";
        hos1.isAvail = true;

        Hospital hos2 = new Hospital();
        hos2.name    = "kauvery";
        hos2.location = "chennai";
        hos2.isAvail = true;

        Hospital hos3 = new Hospital();
        hos3.name = "SIMS";
        hos3.location = "chennai";
        hos3.isAvail = true;

        System.out.println(hos1.name.toUpperCase()+ " " + hos1.location.toUpperCase() + " "+ hos1.isAvail);
        System.out.println(hos2.name.toUpperCase()+ " " + hos2.location.toUpperCase() + " "+ hos2.isAvail);
        System.out.println(hos3.name.toUpperCase()+ " " + hos3.location.toUpperCase() + " "+ hos3.isAvail);
        System.out.println(hos3.location.length());
        System.out.println(hos1.name.equals(hos2.name));
    }
}

class Hospital{
    String name;
    String location;
    boolean isAvail;
}
