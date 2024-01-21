public class Customer {

    private String name;
    private long creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
    public void setCreditLimit(long creditLimit) {
        this.creditLimit = creditLimit;
    }
    public Customer(){
        this("John Doe","johndoe@gmail.com"); //calling two parameter constructor so you don't need to change the credit limit incase;
    }

    public Customer (String name, String email) {
        this(0L,name,email); //calling all parameterized constructor
    }

    public Customer (long creditLimit, String name, String email) {
        this.creditLimit = creditLimit;
        this.name = name;
        this.email = email;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", email='" + email + '\'' +
                '}';
    }
}
