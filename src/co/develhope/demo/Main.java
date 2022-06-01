package co.develhope.demo;

public class Main {
    public static void main(String[] args) {

        Greeting g = new Greeting();

        g.setName("Carlo");

        System.out.printf("Hello %s!", g.getName());
    }
}
