package com.company;

public class Main {

    public static void main(String[] args) {

        Hero hero1 = new Hero("Warrior",200,20,"Phythkal");
        Hero hero2 = new Hero("macikal",200,20,"Magikal");
        Hero hero3 = new Hero("cinetik",200,20,"mental");
        Hero hero4 = new Hero("healer",200,20,"Medikal");
        hero1.printinfo();
        System.out.println("..............................");
        hero2.printinfo();
        System.out.println("..............................");
        hero3.printinfo();
        System.out.println("..............................");
        hero4.printinfo();
        System.out.println("..............................");


        MagikDoor magikDoor= new MagikDoor();
        magikDoor.generateheros();

    }
}
