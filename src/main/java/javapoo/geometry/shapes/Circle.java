package javapoo.geometry.shapes;


import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public  class Circle extends  Figure {
    private double radius;
    private Scanner scanner = new Scanner(System.in);
    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
        calculatePerimeter();
    }

   @Override
    protected void calculateArea() {
        this.area = Math.PI * radius * radius;
    }

    @Override
    protected void calculatePerimeter() {
        this.perimeter = 2 * Math.PI * radius;
    }

}

