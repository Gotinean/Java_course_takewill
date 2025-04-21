package homework2.circle;

import homework1.Main;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Circle Area = " + area);
    }
}
