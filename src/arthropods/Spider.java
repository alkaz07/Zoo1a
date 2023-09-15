package arthropods;

import zoo.Arthropods;
import zoo.Bite;
import zoo.Crawler;
import zoo.Stepper;

public class Spider extends Arthropods implements Crawler, Stepper {


    @Override
    public void move() {
        crawl();
        walk();
        run();
    }

    @Override
    public void crawl() {
        System.out.println("to crawl");
    }

    @Override
    public void walk() {
        System.out.println("to walks");
    }

    @Override
    public void run() {
        System.out.println("to runs");
    }

}
