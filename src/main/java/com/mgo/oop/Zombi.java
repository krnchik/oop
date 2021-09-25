package com.mgo.oop;

public class Zombi extends Enemy{
    private int countLife = 1;
    private final int startHealth;

    public Zombi(int health, String name, int damage) {
        super(health, name, damage);
        this.startHealth = health;

    }

    public void takeDamage(int damage){
        if(isAlive() && getHealth()<=damage){
            setHealth(0);
            System.out.println(getName()+ " погиб");
            if(countLife == 1){
                setHealth(startHealth);
                countLife = 0;
                System.out.println(getName()+" воскресает");
            }
            }
        else {
            int health = getHealth();
            health -= Math.min(getHealth(), damage);
            setHealth(health);
            System.out.println(getName() + " получил урон " + damage + " здоровья осталось " + getHealth());
        }
    }

    public void attackHero(Hero... heroes){
        if(isAlive()) {
            for (Hero hero: heroes) {
                System.out.println(getName() + " аттаковал героя " + hero.getName());
                hero.takeDamage(getDamage());
            }
        }
    }
}
