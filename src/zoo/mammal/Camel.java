package zoo.mammal;

import zoo.Stepper;
import zoo.Swimmer;

public class Camel extends Mammal implements Stepper, Swimmer {
    @Override
    public void move() {
        walk();
        run();
        swim();
        ;
        ;
    }

    @Override
    public void walk() {
        System.out.println("Верблюд идет");
    }

    @Override
    public void run() {
        System.out.println("Верблюд мчится");

    }

    @Override
    public void swim() {
        System.out.println("Верблюд барахтается");
    }
}
