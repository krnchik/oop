package com.mgo.oop;

public class TrainingGround {
    public static void main(String[] args) {

        Hero warrior = new Warrior("Боромир", 10, 50);
        Hero mage = new Mage("Гендельф", 25, 40);
        Hero archer = new Archer("Леголаз", 20, 60);
        Enemy enemy = new Enemy(50, "Org", 20);
        Enemy zombi = new Zombi(100,"Main Zombi", 100);

        attackEnemy(enemy,warrior, mage, archer);
        attackHero(zombi, archer, warrior, mage);
        attackEnemy(zombi,warrior, mage, archer);

    }

    public static void attackEnemy(Enemy enemy,Hero... heroes){
           for (Hero hero : heroes) {
               if(enemy.isAlive())
               hero.attackEnemy(enemy);
               else
                   break;
           }
    }

    public static void attackHero(Enemy enemy, Hero... heroes){
            enemy.attackHero(heroes);

    }
}
