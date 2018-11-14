package com.nicolae;

import javax.security.auth.login.AccountException;

public class Main {

    public static void main(String[] args) {

        //== Creating Objects from Classes ==

//        BankAccount aleAccount = new BankAccount();//(887766,1000, "Alexandra", "email@email.com","0756***222");
//
//        BankAccount nicoAccount = new BankAccount();
//        nicoAccount.setAccountNumber(776655);
//        nicoAccount.setBalance(100);
//        nicoAccount.setCustomerName("Nicolae Onu");
//        nicoAccount.setEmail("nicolae@gmail.com");
//        nicoAccount.setPhoneNumber("0749***9567");
//
//        nicoAccount.deposit(300);
//        nicoAccount.withdraw(500);
//
//        System.out.println(aleAccount.getCustomerName());
//        System.out.println(aleAccount.getAccountNumber());
//        aleAccount.deposit(500);
//
//
//        BankAccount casianAccount = new BankAccount("Tim","asdfasd@gmail.com","234123412");
//        System.out.println(casianAccount.getAccountNumber() + " name " + casianAccount.getCustomerName());


        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        System.out.println(person1.getLimit());
        System.out.println(person1.getEmailAddress());
        System.out.println("*************************");
        VipCustomer person2 = new VipCustomer("Bob", 25000);
        System.out.println(person2.getName());
        System.out.println(person2.getLimit());
        System.out.println(person2.getEmailAddress());
        System.out.println("*************************");
        VipCustomer person3 = new VipCustomer("Tim",100,"tim.@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getLimit());
        System.out.println(person3.getEmailAddress());
    }
}
