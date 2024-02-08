package dev.ele.dev.ele;

import java.util.ArrayList;
import java.util.LinkedList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void addCustomer (Customer customer) {
        if(!customers.contains(customer)) {
            customers.add(customer);
            System.out.println("Successfully added customer : " + customer.getName());
        }
        System.out.println("Customer already added");
    }

    public void addTransactions (Customer customer, double transactionAmount) {
        double balance = 0;
        for(double d: customer.getTransactions()) {
            balance += d;
        }
        System.out.println("Your current balance is :" + balance);
        customer.getTransactions().add(transactionAmount);
        balance += transactionAmount;
        System.out.println("Your balance after the transaction is :"+ balance );
        System.out.println("-".repeat(30));


    }

    public void printStatement (Customer customer) {
        System.out.println("Credits   Debits");
        System.out.println("------------------");
        for(Double d: customer.getTransactions()) {
            if(d < 0) System.out.printf("          %6.2f%n",d);
            else System.out.printf("%6.2f%n",d);
        }
        double balance = 0;
        for(double d: customer.getTransactions()) {
            balance += d;
        }
        System.out.println("Your balance is : " + balance);
    }
}
