package Day2;

public class UseAccountHolder {
    public static void main(String[] args){
        AccountHolder accountHolder1 = new AccountHolder();
        accountHolder1.name = "mano";
        accountHolder1.age = 26;
        accountHolder1.IsMale = true;
        accountHolder1.accountNumber = 28330485612583L;
        accountHolder1.monthlyIncome = 21000;
        accountHolder1.savingPercentage = 18f;
        System.out.println("The Saving amount of this man is : " + (accountHolder1.monthlyIncome * accountHolder1.savingPercentage)/100);

        AccountHolder accountHolder2 = new AccountHolder();
        accountHolder2.name = "Savithri";
        accountHolder2.age = 24;
        accountHolder2.IsMale = false;
        accountHolder2.accountNumber = 28330485612583L;
        accountHolder2.monthlyIncome = 20000;
        accountHolder2.savingPercentage = 20f;
        System.out.println("The Saving amount of this lady is : " + (accountHolder2.monthlyIncome * accountHolder2.savingPercentage)/100);


    }
}

class AccountHolder{
    String name;
    int age;
    Boolean IsMale;
    long accountNumber;
    int monthlyIncome;
    float savingPercentage;





}


