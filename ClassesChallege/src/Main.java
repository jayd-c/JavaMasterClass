import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println(account.toString());


        BankAccount mayAccount = new BankAccount(454646464L, 1000.0, "May", "may@gmail.com");
        mayAccount.deposit(2000);
        mayAccount.withdraw(3100);
        System.out.println(mayAccount.getBalance());
        System.out.println(mayAccount.toString());

        BankAccount jokeAccount = new BankAccount("balla", "salla");
        System.out.println(jokeAccount.toString());

        Customer customer = new Customer();
        Customer.printStaticCustomer();
        customer.setCreditLimit(454646465L);
        System.out.println(customer.toString());
    }
}
