package zoo;

public class Crocodile extends Reptile implements Swimmer{
    @Override
    public void move() {
        swim();
    }

    public void swim()
    {
        System.out.println("�������� ������");
    }

    public void crawl(){

    }
}
