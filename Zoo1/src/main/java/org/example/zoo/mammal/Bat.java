package org.example.zoo.mammal;

import org.example.zoo.flyer;

public class Bat extends Mammal implements flyer {
    @Override
    public void move() {
        fly();
    }

    @Override
    public void fly() {
        System.out.println("Летучая мышь летает и пищит");
    }
}
