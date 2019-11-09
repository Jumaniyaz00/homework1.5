package com.company;

import java.util.Random;

public class Boss {
    private  int  helth;
    private  int  demage;
    private  int  demageTyp;
    public void changeBossDefence(){
        Random r = new Random();
        int randomNom = r.nextInt(3) +1;
        setDemageTyp(randomNom);
    }

    public int getHelth() {
        return helth;
    }

    public void setHelth(int helth) {
        this.helth = helth;
    }

    public int getDemage() {
        return demage;
    }

    public void setDemage(int demage) {
        this.demage = demage;
    }

    public int getDemageTyp() {
        return demageTyp;
    }

    public void setDemageTyp(int demageTyp) {
        this.demageTyp = demageTyp;
    }
}
