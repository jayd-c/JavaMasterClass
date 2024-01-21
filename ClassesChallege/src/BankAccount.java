public class BankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    public BankAccount() {
        this(000000000,0.0,"John Doe","jonedoe@gmail.com");
        System.out.println("*".repeat(30));
        System.out.println("No arg constructor called");
        System.out.println("*".repeat(30));


    }

    public BankAccount(long accountNumber, double balance, String customerName, String customerEmail) {
        System.out.println("*".repeat(30));
        System.out.println("constructor with args called");
        System.out.println("*".repeat(30));

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
    }

    public BankAccount(String customerName, String customerEmail) {
//        this(0,100.55,"Joka","joke@gmail.com");
        this(0,150.0,customerName,customerEmail);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void deposit (double amount) {
        this.balance += amount;
        System.out.printf("Your balance after the deposit of %.2f is %.2f %n",amount,this.balance);
    }

    public void withdraw (double amount) {
        if(this.balance - amount >= 0.0) {
            this.balance -= amount;
            System.out.printf("Your balance after the withdrawal of %.2f is %.2f  %n", amount, this.balance);
        } else {
            System.out.printf("Your balance is %.2f is insufficient to withdraw %.2f at this time %n",this.balance,amount);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                '}';
    }
}
