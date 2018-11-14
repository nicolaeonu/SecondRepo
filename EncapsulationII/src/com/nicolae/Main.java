package com.nicolae;

public class Main {

    public static void main(String[] args) {


//        Player player = new Player();
//        player.fullName = "Nico";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage  =10;
//        player.loseHealth(damage);
//        System.out.println("remaining healt = " + player.healtRemaining());
//        damage = 11;
//        player.health = 100;
//        player.loseHealth(damage);
//        System.out.println("remaining healt = " + player.healtRemaining());


        EnhancePlayer player = new EnhancePlayer("Nico","Sword", 120);
        System.out.println("Initial health is " + player.getHithPoints());
        player.loseHealth(30);
        System.out.println("Initial health is " + player.getHithPoints());

    }
}
