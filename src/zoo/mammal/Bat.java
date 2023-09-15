package zoo.mammal;

import zoo.Flyer;

public class Bat extends Mammal implements Flyer {
    @Override
    public void move() {
        fly();
    }


    @Override
    public void fly() {
        System.out.println("Летучая мышь летает и пищит");
    }
}
