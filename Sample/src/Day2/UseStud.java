package Day2;

public class UseStud {
    public static void main(String[] args){
        Stud stud1 = new Stud();
        stud1.studName = "Ram";
        stud1.studAge = 23;
        stud1.studMobile = 914293829L;
        stud1.marksPercentage = 95;

        System.out.println("Name : "+ stud1.studName + " Age : "+ stud1.studAge + " Mobile Number : "+ stud1.studMobile);

    }
}

class Stud{
    String studName;
    int studAge;
    long studMobile;
    String studSection;
    float marksPercentage;

}
