package zoo;

public class Eagle extends Bird implements Flyer{
    public void fly()
    {
        System.out.println("��� �����");
    }

    @Override
    public void move() {
        fly();
    }
}
