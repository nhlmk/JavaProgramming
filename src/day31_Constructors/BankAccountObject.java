package day31_Constructors;

public class BankAccountObject {
    public static void main(String[] args) {


        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setInfo("Ahmet Ozkok", 123456789, 0 );
        System.out.println(bankAccount1);
        bankAccount1.deposit(10000);
        bankAccount1.checkBalance();

        bankAccount1.withdraw(900);
        bankAccount1.checkBalance();

        bankAccount1.deposit(900);
        bankAccount1.checkBalance();

        System.out.println(" = = == = = = = = = = = = = = = = = =");

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.setInfo("KaleSalad", 1230987654, 100);

        bankAccount2.deposit(1000);
        bankAccount2.checkBalance();

        bankAccount2.withdraw(500);


    }
}