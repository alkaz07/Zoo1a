package org.example.zoo;

import org.example.zoo.mammal.Bat;
import org.example.zoo.mammal.Elephant;

public class Main {
    public static void main(String[] args) {
        example1();
        example2();


    }

    private static void example2() {
        flyer flyers[] = {new Bat(),new Eagle(), new Eagle()};
        for(flyer f: flyers) {
            f.fly();
            if(f instanceof Bird)
                System.out.println("Летит как птица");
        }
    }

    private static void example1() {
        Elephant elephants[]={new Elephant(),new Elephant(), new Elephant()};
        for (Elephant e: elephants){
           e.swim();
        }

        Penguin penguin = new Penguin();
        penguin.swim();
        System.out.println("===============================================");
        Animal animals[]={new Elephant(), new Penguin(), new Penguin()};
        for (Animal a: animals){
            if(a instanceof Swimmer)
                ((Swimmer) a).swim();
        }
    }
}