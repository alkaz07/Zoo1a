package org.example.zoo;

public class Eagle extends Bird implements flyer{
    public void fly(){
        System.out.println("Орел летит");
    }

    @Override
    public void move() {
        fly();
    }
}
