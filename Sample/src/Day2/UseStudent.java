package Day2;

public class UseStudent{
    public static void main(String[] args){
        Student stud1 = new Student();
        stud1.name = "Shiva";
        stud1.id = 234;
        stud1.age = 14;
        stud1.classes = "XI";
        stud1.percentage = 75f;
        stud1.DaysPresent = (240*75)/100;
        System.out.print(stud1.DaysPresent);

    }
}

class Student{
    String name;
    int id;
    int age;
    String classes;
    float percentage;
    int WorkingDays;
    float DaysPresent;
}