package zoo;

import zoo.mammal.Bat;
import zoo.mammal.Elephant;

public class Main {
    public static void main(String[] args) {
        exemple1();
        exemple2();
    }

    private static void exemple2() {
        Flyer flyers[] = {new Bat(), new Bat(), new Eagle(), new Eagle()};
        for (Flyer f: flyers    ) {
            f.fly();
            if(f instanceof Bird)
                System.out.println("летит как птица");
        }
    }

    private static void exemple1() {
        Elephant elephants[] = {new Elephant(), new Elephant(), new Elephant()};
        for (Elephant e: elephants ) {
            e.swim();
        }

        Penguin penguin = new Penguin();
        penguin.swim();
        System.out.println("=====================================");
        Animal animals[] = {new Elephant(), new Penguin(), new Penguin()};
        for (Animal a: animals)
        {
            if(a instanceof Swimmer)
                ((Swimmer) a).swim();
        }
    }
}