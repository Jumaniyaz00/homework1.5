package com.company;

public class MagikDoor {
    public Hero[] generateheros(){
        Hero [] heroesArr= new Hero[4];
        Hero warrior = new Hero("Warrior",200,20,"Phythkal");
        heroesArr[0]= warrior;

        Hero macikal= new Hero("macikal",200,20,"Magikal");
        heroesArr[1]= macikal;

        Hero cinetik = new Hero("cinetik",200,20,"mental");
        heroesArr[2]= cinetik;

        Hero healer = new Hero("healer",200,20,"Medikal");
        heroesArr[3]= healer;
        return heroesArr;
    }
}
