package com.ug9.mobilelegend;

public class NPC extends Character{
    public NPC(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attack(Character enemy) {
        if(enemy instanceof Melee || enemy instanceof Ranged){
            enemy.setHealth(enemy.getHealth()- getDamage() + 100);
            if(enemy.getHealth() <= 0){
                enemy.setDie(true);
                enemy.setHealth(0);
            }
            attackInformation(enemy, getDamage() + 100);
        }else {
            enemy.setHealth(enemy.getHealth() - getDamage());
            if(enemy.getHealth() <= 0){
                enemy.setDie(true);
                enemy.setHealth(0);
            }
            attackInformation(enemy, getDamage());
        }
    }
}
