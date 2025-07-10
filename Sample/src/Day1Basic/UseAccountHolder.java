package Day1Basic;

public class UseAccountHolder {
    public static void main(String[] args){
        AccountHolder person1 = new AccountHolder();
        person1.name = "Mano";
        person1.age = 26;
        person1.gender = "Male";
        person1.AccountNumber = 27263834762L;
        person1.montlyIncome = 21000;
        person1.percentage = 18;
        person1.savingPercentage = (person1.montlyIncome* person1.percentage)/100;
        System.out.println("Saving percentage for person1 is : "+ person1.savingPercentage);

        AccountHolder person2 = new AccountHolder();
        person2.name = "Savithri";
        person2.age = 25;
        person2.gender = "Male";
        person2.AccountNumber = 27263834762L;
        person2.montlyIncome = 20000;
        person2.percentage = 20;
        person2.savingPercentage = (person2.montlyIncome* person2.percentage)/100;
        System.out.println("Saving percentage for person1 is : "+ person2.savingPercentage);

        AccountHolder person3 = new AccountHolder();
        person3.name = "Kamban";
        person3.age = 30;
        person3.gender = "Male";
        person3.AccountNumber = 27263834762L;
        person3.montlyIncome = 30000;
        person3.percentage = 10;
        person3.savingPercentage = (person3.montlyIncome* person3.percentage)/100;
        System.out.println("Saving percentage for person1 is : "+ person3.savingPercentage);




    }
}

class AccountHolder{
    String name;
    int age;
    String gender;
    long AccountNumber;
    int montlyIncome;
    int savingPercentage;
    int percentage;
}
