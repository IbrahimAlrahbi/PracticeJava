package oopEncapsulation.BankSystem;

public class Account {
    private int accountNo;
    private String name;
    private float amount;

    public void insert (int a, String n, float amt){
        this.accountNo = a;
        this.name = n;
        this.amount = amt;

    }

    public void deposit(float amt){
        this.amount = this.amount + amt;
        System.out.println(amt + " deposited");
    }

    public void withdraw(float amt){
        if(amount < amt) {
            System.out.println("Insufficient balance!");
        } else{
            this.amount = this.amount - amt;
            System.out.println(amt + " withdrawn");
        }
    }

    public void checkBalance(){
        System.out.println("Balance = " + this.amount);
    }

    public String toString(){
        return "Account (" + "accountNo = " + accountNo + ", name= " + name + ", amount= " + amount;
    }
}

