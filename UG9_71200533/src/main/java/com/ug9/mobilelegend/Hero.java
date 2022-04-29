package com.ug9.mobilelegend;

public class Hero extends Character {
    private int healthBonus;
    private int level;
    private int healthMax;
    private int lifeSteal = 50;


    public Hero(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attack(Character enemy) {
        if(enemy.getHealth()<= 0) {
            enemy.setDie(true);
            this.level = this.level +1;
            if (enemy instanceof Melee || enemy instanceof Ranged) {
                this.lifeSteal += 150;
            }
            else if (enemy instanceof Minion || enemy instanceof Creep) {
                this.healthMax = this.healthMax + this.healthBonus;
            }
        }
        attackInformation(enemy, this.getDamage());
    }


    public void addDamage(int damageBonus) {
        setDamage(getDamage()+damageBonus);
    }

    public void setHealthBonus(int healthBonus) {
    }

    public int getLevel() {
        return level;
    }
}