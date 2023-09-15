package zoo.mammal;

import zoo.Stepper;
import zoo.Swimmer;

public class Elephant extends Mammal implements Stepper, Swimmer {
    @Override
    public void move() {
        walk();
    }

    public void walk(){
        System.out.println("���� ����. ���-���");
    }

    public void run(){
        System.out.println("���� �����. ���-���-���");
    }


    @Override
    public void swim() {
        System.out.println("���� ������");
    }
}
