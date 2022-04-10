package day31_Constructors;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
     public double accountBalance;

    public void setInfo(String accountHolder, long accountNumber, double accountBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                '}';
    }

    public void checkBalance(){
        System.out.println("your available balance is : " + accountBalance);
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Depositing amount can not be zero or negative.");
        }
        accountBalance += amount;
    }


    public void withdraw(double amount){
        if(amount>0){
            System.out.println("insufficient");
            return;
        }
        if(amount<=0){
            System.out.println("withdrawing succes");
            return;
        }
        accountBalance-=amount;
    }

}
