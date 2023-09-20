package zoo;

public class Strauss extends Bird implements Stepper{

    @Override
    public void move() {
        walk();
        run();
    }

    @Override
    public void walk() {
        System.out.println("Страус гуляет");

    }

    @Override
    public void run() {
        System.out.println("Страус бежит");

    }
}
