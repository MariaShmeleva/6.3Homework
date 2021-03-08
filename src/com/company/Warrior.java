package com.company;

public class Warrior extends Ork implements Destroying {
    public Warrior(String name) {
        this.name = name;
        this.specialization = "Воин";
    }

    @Override
    public void run(String name) {
        System.out.println(specialization + " Орк " + name + " отказывается сражаться и уходит домой");
    }


    @Override
    public void attackNear(String name) {
        System.out.println(specialization + " " + name + " бьет своим мощным кулаком");

    }


    @Override
    public void attack(String name) {
        System.out.println(name + " замахивается своим двуручным топором и наносит удар");
    }

    @Override
    public void protection(String name) {
        System.out.println(specialization + " " + name + " уворачивается");

    }
}
