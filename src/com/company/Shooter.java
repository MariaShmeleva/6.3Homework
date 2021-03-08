package com.company;

public class Shooter extends Ork implements Shooting {
    public Shooter(String name) {
        this.name = name;
        this.specialization = "Стрелок";
    }

    @Override
    public void run(String name) {
        System.out.println(specialization + " Орк " + name + " убегает в растроенных чувствах");
    }


    @Override
    public void attackFar(String name) {
        System.out.println(specialization + " " + name + " стреляет из огнемета");

    }


    @Override
    public void attackNear(String name) {
        System.out.println(name + " выстреливает из обреза");
    }

    @Override
    public void protection(String name) {
        System.out.println(specialization + " " + name + " с помощью своего бронежилета спасается от расправы");

    }
}
