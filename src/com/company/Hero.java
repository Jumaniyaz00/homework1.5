package com.company;

public class Hero {
    private String name;
    private  int  helth;
    private  int  demage;
    private  String   demageTyp;

    public Hero(String name , int helth, int demage, String demageTyp) {
        this.helth = helth;
        this.demage = demage;
        this.demageTyp = demageTyp;
    }
    public void printinfo(){
        System.out.println(" typ attek  "+ demageTyp+ "\n"+ "heth geroes   "+ helth+"\n"+
                "урон героя    "+ demage);

    }
}
