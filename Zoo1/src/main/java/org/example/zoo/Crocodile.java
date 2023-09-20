package org.example.zoo;

public class Crocodile extends  Reptile implements Swimmer{
    @Override
    public void move() {
     swim();
    }
    public void swim(){
        System.out.println("Крокодил плавает");
    }
    public void crawl(){

    }

}
