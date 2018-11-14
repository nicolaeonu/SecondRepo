package com.nicolae;

public class Main {

    public static void main(String[] args) {

        Outlander outlander = new Outlander(36);
        outlander.steer(50);
        outlander.accelerate(35);
        outlander.accelerate(25);
        outlander.accelerate(-47);

    }
}

