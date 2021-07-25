package ru.samsung.itschool.mdev;

import java.util.Random;

class Unit {
    private String name;
    private int health;

    public Unit(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void printInfo() {
        System.out.println("Name:" + name);
        System.out.println("Health:" + health);
    }
}
class Robot extends Unit{
    int armor;
    public Robot(String name, int health, int armor) {
        super(name, health);
        this.armor = armor;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Armor:" + armor);
    }
}
class Wizard extends Unit{
    int mana;
    public Wizard(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Mana:" + mana);
    }
}
class Terminator extends Robot{
    String gun;
    public Terminator(String name, int health, int armor, String gun) {
        super(name, health, armor);
        this.gun = gun;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Gun:" + gun);
    }
}
public class Main{
    public static void main(String [] args){
        Unit [] units = new Unit[5];
        for(int i=0;i<units.length;i++){
            switch(new Random().nextInt(3)){
                case 0:units[i]=new Robot("Robot", 100, 100);break;
                case 1:units[i]=new Wizard("Wizard", 99, 80);break;
                case 2:units[i]=new Terminator("Terminator", 150, 150, "AK-47");break;
            }
        }
        for(Unit u: units) {
            u.printInfo();
            System.out.println();
        }
    }
}
