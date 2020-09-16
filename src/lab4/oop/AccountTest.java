package lab4.oop;

public class AccountTest {
    public static void main(String [] args){
        Account account1 = new Account("Athittaya", 4000);
        Account account2 = new Account("Mook", 6000);
        
        System.out.println(account1.getBalance());
        System.out.println(account1.getName());

        System.out.println(account2.getBalance());
        System.out.println(account2.getName());

        account1.deposit(50000);

    }
}
