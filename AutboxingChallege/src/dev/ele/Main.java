package dev.ele;

import dev.ele.dev.ele.Bank;
import dev.ele.dev.ele.Customer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Chase",new ArrayList<>());

        Customer d  = new Customer("David",new ArrayList<>());

        bank.addCustomer(d);

        bank.addTransactions(d,100);
        bank.addTransactions(d,-500);
        bank.addTransactions(d,1000);
        bank.addTransactions(d,-130.22);

        bank.printStatement(d);

    }
}
