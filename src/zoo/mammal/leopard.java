package zoo.mammal;

import zoo.ClimbingTrees;
import zoo.Stepper;

public class leopard extends Mammal implements Stepper, ClimbingTrees {
    @Override
    public void move() {

    }

    @Override
    public void walk() {
        System.out.println("Leopard walk ");
    }

    @Override
    public void run() {
        System.out.println("Leopard run" );
    }

    @Override
    public void climb() {
        System.out.println( "Leopard climbing on tree" );
    }
}
