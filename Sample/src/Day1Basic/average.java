package Day1Basic;

public class average {
    public static void main(String[] args){
        int english = 90;
        int hindi = 99;
        int maths = 89;
        int science = 98;
        int sst = 99;
        int total = (english+hindi+maths+science+sst);
        int average = (english+hindi+maths+science+sst)/5;

        System.out.println("The total and average of this is : " + total+ " and " + average);

    }
}
