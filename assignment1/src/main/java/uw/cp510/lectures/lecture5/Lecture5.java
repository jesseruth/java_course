package uw.cp510.lectures.lecture5;

public class Lecture5 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Boat boat = new Boat("swing", "My Boat");
        Car car = new Car("swing", 3);
        System.out.println(boat.getName());
        System.out.println(boat.toString());

        System.out.println(car.getName());
        System.out.println(car.toString());

    }
}
