package com.nicolae;

public class Main {

    public static void main(String[] args) {

        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("Banca Comerciala Romana");

        if(bank.addBranch("Piata Alba Iulia")) {
            System.out.println("Piata Alba Iulia branch created");
        }

        bank.addCustomer("Piata Alba Iulia", "Nic", 60.05);
        bank.addCustomer("Piata Alba Iulia", "Alex", 155.55);
        bank.addCustomer("Piata Alba Iulia", "Stela", 220.20);

        bank.addBranch("Unirii");
        bank.addCustomer("Unirii", "Andrei", 150.50);

        bank.addCustomerTransaction("Piata Alba Iulia", "Nic", 44.44);
        bank.addCustomerTransaction("Piata Alba Iulia", "Nic", 12.12);
        bank.addCustomerTransaction("Piata Alba Iulia", "Alex", 1.23);

        bank.listCustomers("Piata Alba Iulia", true);
        bank.listCustomers("Unirii", true);

        bank.addBranch("Eroilor");

        if(!bank.addCustomer("Eroilor", "Bogdan", 4.56)) {
            System.out.println("Error Eroilor branch does not exist");
        }

        if(!bank.addBranch("Piata Alba Iulia")) {
            System.out.println("Piata Alba Iulia branch already exists");
        }

        if(!bank.addCustomerTransaction("Piata Alba Iulia", "Florin", 50.00)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Piata Alba Iulia", "Tibi", 20.00)) {
            System.out.println("Customer Tibi already exists");
        }
    }

}


