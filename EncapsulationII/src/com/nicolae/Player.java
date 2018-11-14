package com.nicolae;

public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player Knocked out ");

        }
    }
    public int healtRemaining(){
        return this.health;
    }
}
