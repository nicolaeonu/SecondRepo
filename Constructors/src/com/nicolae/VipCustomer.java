package com.nicolae;

public class VipCustomer {
    private String name;
    private int limit;
    private String emailAddress;



    public VipCustomer(){
        this("default name",5000,"default@email.com");
    }

    public VipCustomer(String name, int limit) {
        this(name,limit,"unknow@email.com");
    }

    public VipCustomer(String name, int limit, String emailAddress) {
        this.name = name;
        this.limit = limit;
        this.emailAddress = emailAddress;
    }


    public String getName() {
        return name;
    }

    public int getLimit() {
        return limit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
