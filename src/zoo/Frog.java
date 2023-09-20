package zoo;

public class Frog extends Animal implements Swimmer, Jump{
    @Override
    public void move() {
        jump();
    }

    @Override
    public void swim() {
        System.out.println("Лягушка плавает");
    }

    @Override
    public void jump() {
        System.out.println("Лягушка прыгает и квакает");
    }
}

