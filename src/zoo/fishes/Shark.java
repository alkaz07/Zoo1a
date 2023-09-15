package zoo.fishes;

import zoo.Animal;
import zoo.Bite;
import zoo.Swimmer;

public class Shark extends Animal implements Swimmer, Bite {
    @Override
    public void move() {
        bites();
        swim();
    }

    @Override
    public void bites() {
        System.out.println("to bites");
    }

    @Override
    public void swim() {
        System.out.println("to swims");
    }
}
