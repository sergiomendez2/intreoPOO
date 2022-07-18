package javapoo.geometry.shapes;

import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class Rectangle extends Figure {
    private double width;
    private double height;

    private Scanner scanner = new Scanner(System.in);
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    protected void calculateArea() {
        this.area = width * height;
    }

    @Override
    protected void calculatePerimeter() {
        this.perimeter = 2 * (width + height);
    }
}
