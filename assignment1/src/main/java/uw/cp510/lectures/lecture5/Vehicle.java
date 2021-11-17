package uw.cp510.lectures.lecture5;

import java.util.Objects;

public class Vehicle {
    private String name;
    private String hierarchyType;

    /**
     * Create new vehicle.
     *
     * @param name Name of vehicle.
     */
    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;

        Vehicle vehicle = (Vehicle) o;

        if (!getName().equals(vehicle.getName())) return false;
        return getHierarchyType().equals(vehicle.getHierarchyType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hierarchyType);
    }

    public String getHierarchyType() {
        return hierarchyType;
    }

    public void setHierarchyType(String hierarchyType) {
        this.hierarchyType = hierarchyType;
    }

    /**
     * Vehicle Name.
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Update vehicle name.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Vehicle string.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
