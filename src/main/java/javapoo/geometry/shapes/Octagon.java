package javapoo.geometry.shapes;

import lombok.NoArgsConstructor;

import java.util.Scanner;
 @NoArgsConstructor
public class Octagon extends Figure {
    private double side;

    private Scanner scanner = new Scanner(System.in);
    public Octagon(double side) {
        this.side = side;
        calculateArea();
        calculatePerimeter();
    }



    @Override
    protected void calculateArea() {
        this.area = side * side * 8;
    }

    @Override
    protected void calculatePerimeter() {
        this.perimeter = side * 8 * 2;
    }

}
