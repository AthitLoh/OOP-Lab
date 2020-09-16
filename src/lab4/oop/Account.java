package lab4.oop;

public class Account {
    //Attribute
    private String name;
    private double balance;

    //Constructor
    public Account(String name, double balance){
        this.name = name;
        if(this.balance >= 0){
            this.balance = balance;
        }else{
            this.balance = 0;
        }

    }

    public void deposit(double depositAmount){
        if(depositAmount > 0){
            this.balance += depositAmount;
        }
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getBalance(){
        return this.balance;
    }

}
