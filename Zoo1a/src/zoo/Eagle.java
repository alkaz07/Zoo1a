package zoo;

public class Eagle extends Bird implements Flyer{
    public void fly()
    {
        System.out.println("ќрЄл летит");
    }

    @Override
    public void move() {
        fly();
    }
}
