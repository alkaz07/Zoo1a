package zoo;

public class Gekon extends Reptile implements Crawler,Stepper {
    @Override
    public void move() {

    }

    @Override
    public void crawl() {
        System.out.println("Gekon crawl ");
    }

    @Override
    public void walk() {
        System.out.println("Gekon walk ");
    }

    @Override
    public void run() {
        System.out.println( "Gekon run" );
    }
}
