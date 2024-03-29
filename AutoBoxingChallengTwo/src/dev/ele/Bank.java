package dev.ele;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank (String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch (String name) {
        Branch b = findBranch(name);
        if(b != null) return false;
        else {
            branches.add(new Branch(name));
            return true;
        }
    }
    public boolean addCustomer(String branchName, String cusName, double tran) {
        Branch  branch = findBranch(branchName);
        if(branch == null) {
            return false;
        } else {
            return branch.newCustomer(cusName,tran);

        }


    }

    public boolean addCustomerTransaction (String branchName, String cusName, double amount) {
        Branch b = findBranch(branchName);
        if(b != null) {
            return b.addCustomerTransaction(cusName,amount);

        }
        return false;
    }
    public Branch findBranch (String name) {
        for(Branch b: branches) {
            if(b.getName().equals(name)) {
                return b;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {

        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
