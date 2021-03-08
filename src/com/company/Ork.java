package com.company;

abstract class Ork {
    protected String name;
    protected String specialization;

    public abstract void run(String name);

    public void die(String name) {
        System.out.println(specialization + " " + name + " проигрывает и умирает");
    }

}