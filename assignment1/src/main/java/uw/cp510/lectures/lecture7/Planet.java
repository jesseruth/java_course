package uw.cp510.lectures.lecture7;

public enum Planet {
    MERCURY(1.0e+1,1.0),
    EARTH(1.0,1.0),
    MARS(1.0,1.0),
    ;


    private Double mass;
    private Double radius;

    Planet(Double mass, Double radius) {
        this.mass = mass;
        this.radius = radius;
    }
}
