package com.nicolae;

public class EnhancePlayer {
    private String name;
    private String weapon;
    private int hithPoints =100;

    public EnhancePlayer(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if(health > 0 && health <=100){
            this.hithPoints = health;
        }
    }
    public void loseHealth(int damage){
        this.hithPoints = this.hithPoints - damage;
        if(this.hithPoints <= 0){
            System.out.println("Player Knocked out ");

        }
    }

    public int getHithPoints() {
        return hithPoints;
    }
}
