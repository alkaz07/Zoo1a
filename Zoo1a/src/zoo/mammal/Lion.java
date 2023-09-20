package zoo.mammal;

import zoo.Stepper;
import zoo.Swimmer;

public class Lion extends Mammal implements Stepper, Swimmer {
    @Override
    public void move() {
        run();
    }


    @Override
    public void walk() {

    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }
}
