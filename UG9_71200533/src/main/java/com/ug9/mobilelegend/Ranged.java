package com.ug9.mobilelegend;

public class Ranged extends Hero implements Skill {

    public Ranged(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attack(Character enemy) {
        if (enemy instanceof Minion) {
            setHealthBonus(150);
        }
        System.out.println(this.getName() + "memberikan serangan ke hero." + enemy.getName() + "sebesar" + getDamage());
    }

    @Override
    public void ultimate() {
        this.setDamage(this.getDamage() + 150);
        System.out.println(this.getName() + "mengaktifkan ulti. Damage saat ini bertambah 150");


    }
}