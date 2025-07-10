package Day2;

public class UseEmployee {
    public static void main(String[] args){
        Employee emp1 = new Employee();
        emp1.employeeName = "Rahul";
        emp1.EmployeeId = 1234;
        emp1.dateOfBirth = 1999;
        emp1.mobileNumber = 91237493739L;
        System.out.println("Emp Name : "+ emp1.employeeName + " Emp ID : "+emp1.EmployeeId + " Emp Number : "+emp1.mobileNumber);

        Employee emp2 = new Employee();
        emp2.employeeName = "Rakul";
        emp2.EmployeeId = 1235;
        emp2.dateOfBirth = 2000;
        emp2.mobileNumber = 9128473887l;

    }

}

class Employee {
    int EmployeeId;
    String employeeName;
    int dateOfBirth;
    long mobileNumber;


}
