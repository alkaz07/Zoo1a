package zoo;

import zoo.bugs.Bug;

public class Fly extends Animal implements Flyer, Bite, Crawler{
    @Override
    public void move() {
        fly();
        bites();
        crawl();
    }

    @Override
    public void fly() {
        System.out.println("Муха летает и нервно жужжит");
    }

    @Override
    public void bites() {
        System.out.println("Fresh blood!");
    }

    @Override
    public void crawl() {
        System.out.println("Муха тихо ползает");
    }
}
