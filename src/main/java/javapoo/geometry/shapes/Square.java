package javapoo.geometry.shapes;

import lombok.NoArgsConstructor;

import java.util.Scanner;


@NoArgsConstructor
public class Square extends Figure {
    private double side;
    private Scanner scanner = new Scanner(System.in);

    public Square(double side) {
        this.side = side;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    protected void calculateArea() {
        this.area = side * side;
    }

    @Override
    protected void calculatePerimeter() {
        this.perimeter = 4 * side;
    }

}
