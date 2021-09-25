package com.mgo.oop;

public abstract class Hero implements Mortal {
    private String name;
    private int damage;
    private int health;

    public Hero(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }


    public abstract void attackEnemy(Enemy enemy);
    public abstract void takeDamage(int damage);

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }


}
