package dev.ele;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public ArrayList<Customer> getCustomers () {
        return customers;
    }

    public boolean newCustomer(String name, double initialTran) {
        Customer cus = findCustomer(name);

        if(cus == null) {
            cus = new Customer(name, initialTran);
            customers.add(cus);
            return true;

        } else {
            return false;
        }
    }
    public boolean addCustomerTransaction(String name, double tran) {
        Customer cus = findCustomer(name);
        if(cus != null) {
            return false;
        } else {
            cus.addTransaction(tran);
            return true;
        }
    }

    private Customer findCustomer (String name) {
        for(Customer c: customers) {
            if(c.getName().equals(name)) {
                return c;
            }
        }
        return null;


    }
}
