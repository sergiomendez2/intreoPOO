package javapoo.geometry.shapes;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public abstract class Figure {
    protected double area;
    protected double perimeter;
     protected abstract void calculateArea();
    protected abstract void calculatePerimeter();
}
