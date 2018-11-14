package com.nicolae;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(2345342,45,"asdgfasd","sfdgsdfg","456345234");
        System.out.println("empty constructor called");
    }

    public BankAccount(int accountNumberNumber, int balance,String customerName,String email, String phoneNumber){
        this.accountNumber = accountNumberNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Acount constructor with parameters called");
    }


    public BankAccount(String customerName, String email, String phoneNumber) {
        this(999,356,customerName,email,phoneNumber);
    }

    public void deposit(int depositAmount){
        System.out.println("You deposit: "+ depositAmount);
        this.balance += depositAmount;
        System.out.println("Your new balance its : " + this.balance);
    }

    public void withdraw (int withdrawAmount){
        System.out.println("You want to withdraw : " + withdrawAmount);
        if(this.balance - withdrawAmount < 0) {
            System.out.println("Insuficient founds, try an amount under: "+this.balance);
        }else{
            this.balance -= withdrawAmount;
            System.out.println("Your new balance its: " + this.balance);
        }
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



}



































