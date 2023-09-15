package zoo;

public class Penguin extends Bird implements Swimmer{
    @Override
    public void move() {
        swim();
    }

    public void swim()
    {
        System.out.println("Пингвин плывет");
    }
}
