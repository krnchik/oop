package com.mgo.oop;

public class Mage extends Hero{
    public Mage(String name, int damage, int health) {

        super(name, damage, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if(isAlive()) {
            System.out.println(getName() + " сотворил заклинание на " + enemy.getName());
            enemy.takeDamage(getDamage());
        }else {

        }
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    public void takeDamage(int damage) {
        if(isAlive() && getHealth()<=damage){
            setHealth(0);
            System.out.println(getName()+ " погиб");
        }else {
            int health = getHealth();
            health -= Math.min(getHealth(), damage);
            setHealth(health);
            System.out.println(getName() + " получил урон " + damage + " здоровья осталось " + getHealth());
        }
    }
}
