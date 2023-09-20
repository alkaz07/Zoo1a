package org.example.zoo.mammal;

import org.example.zoo.Swimmer;

public class Elephant extends Mammal implements Swimmer {
    @Override
    public void move() {
        walk();
    }
    public void walk(){
        System.out.println("Слон идет. Топ-топ");
    }
    public void run(){
        System.out.println("Слон бежит. Бум-бум-бум");
    }

    @Override
    public void swim() {
        System.out.println("Слон плывет");
    }
}
