package com.mgo.oop;

public class Enemy implements Mortal {
    private int health;
    private String name;
    private int damage;

    public Enemy(int health, String name, int damage) {
        this.health = health;
        this.name = name;
        this.damage = damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        if(isAlive() && health<=damage){
            health = 0;
            System.out.println(name+ " погиб");
        }else {
            this.health -= Math.min(health, damage);
            System.out.println(name + " получил урон " + damage + " здоровья осталось " + health);
        }
    }

    public void attackHero(Hero... heroes){
        if(isAlive()) {
            for (Hero hero: heroes) {
                System.out.println(name + " аттаковал героя " + hero.getName());
                hero.takeDamage(getDamage());
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }


}
