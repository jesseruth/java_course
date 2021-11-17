package uw.cp510.lectures.lecture5;

import java.util.Objects;

public class Boat extends Vehicle {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Boat)) return false;
        if (!super.equals(o)) return false;
        Boat boat = (Boat) o;
        return getKeelType().equals(boat.getKeelType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getKeelType());
    }

    private String keelType;

    public String getKeelType() {
        return keelType;
    }

    public void setKeelType(String keelType) {
        this.keelType = keelType;
    }

    public Boat(String keelType, String name) {
        super(name);
        this.keelType = keelType;
    }

    @Override
    public String toString() {
        return super.toString() + "Boat{" +
                "keelType='" + keelType + '\'' +
                '}';
    }

    @Override
    public String getHierarchyType() {
        return super.getHierarchyType() + " and Boat";
    }
}
