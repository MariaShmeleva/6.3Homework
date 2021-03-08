package com.company;

public class Battle {
    public void start() {
        Shooter shooter = new Shooter("Грефинос");
        Warrior warrior = new Warrior("Эрригур");
        shooter.attackFar(shooter.name);
        warrior.protection(warrior.name);
        shooter.attackNear(shooter.name);
        warrior.protection(warrior.name);
        warrior.attack(warrior.name);
        shooter.protection(shooter.name);
        warrior.attackNear(warrior.name);
        shooter.die(shooter.name);
    }

}
