package Day1Basic;

public class UseEmployee {
    public static void main(String[] args){
        Employee emp1 = new Employee();
        emp1.employeeID = 12345;
        emp1.dateOfBirth = "03/03/1999";
        emp1.employeeName = "Akashay";
        emp1.mobileNum = 9123232948L;

        System.out.println("+91 "+emp1.mobileNum);

        Employee emp2 = new Employee();
        emp2.employeeID = 12346;
        emp2.dateOfBirth = "04/04/1997";
        emp2.employeeName = "Neeraj";
        emp2.mobileNum = 9121213222L;
        System.out.println("91 "+emp2.mobileNum);

    }
}


class Employee{
    int employeeID;
    String employeeName;
    String dateOfBirth;
    long mobileNum;

}