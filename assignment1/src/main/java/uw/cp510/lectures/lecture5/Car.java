package uw.cp510.lectures.lecture5;

import java.util.Objects;

public class Car extends Vehicle {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        if (!super.equals(o)) return false;

        Car car = (Car) o;

        return getNumberOfWheels() == car.getNumberOfWheels();
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfWheels);
    }

    private int numberOfWheels;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public Car(String name, int numberOfWheels) {
        super(name);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        return super.toString()+ "Car{" +
                "numberOfWheels=" + numberOfWheels +
                '}';
    }

    @Override
    public String getHierarchyType() {
        return super.getHierarchyType() + " and Car";
    }
}
