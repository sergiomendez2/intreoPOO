package javapoo.geometry;

import javapoo.geometry.shapes.*;

import java.util.Scanner;



public class Menu{
    private String figureName;
    private Scanner scanner = new Scanner(System.in);
    private Figure octagon;
    private Figure square;
    private Figure rectangle;
    private Figure circle;
    private Figure figureType;
    private int option;
    private final String ERROR = "No figure created yet";

    public void startApp() {
        do{
        showMenu();
        option = scanner.nextInt();
        switch (option) {
            case 1:
                createSquare();
                getFigureType(option);
                break;
            case 2:
                 createCircle();
                 getFigureType(option);
                break;
            case 3:
                 createRectangle();
                 getFigureType(option);
                break;
            case 4:
                createOctagon();
                getFigureType(option);
                break;
            case 5:
                printPerimeter(figureType);
                break;
            case 6:
                printArea(figureType);
                break;
            case 7:

                System.out.println("figure name: "+figureName);
                break;

                case 8: System.out.println("Good bye!");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        }while(option!=8);
    }


    private void getFigureType(int optionSelected){
        switch (optionSelected) {
            case 1:
                 figureType = square;
                 figureName = "Square";
                break;
            case 2:
                figureType = circle;
                figureName = "Circle";
                break;
            case 3:
                figureType = rectangle;
                figureName = "rectangle";
                break;
            case 4:
                figureType = octagon;
                figureName = "Octagon";
                break;
            default:
                figureName = "Unknown";
                break;
        }
    }

    private void printPerimeter(Figure figure) {
        if (figure instanceof Square) {
            System.out.println(" square perimeter: " +square.getPerimeter());
        } else if (figure instanceof Circle) {
            System.out.println(" circle perimeter: " + circle.getPerimeter());
        } else if (figure instanceof Rectangle) {
            System.out.println("rectangle perimeter: " + rectangle.getPerimeter());
        } else if (figure instanceof Octagon) {
            System.out.println("Octagon perimeter: " + octagon.getPerimeter());
        }
        System.out.println(ERROR);
    }

    private void printArea(Figure figure) {
        if (figure instanceof Square) {
            System.out.println(" square Area: " +square.getArea());
        } else if (figure instanceof Circle) {
            System.out.println(" circle Area: " + circle.getArea());
        } else if (figure instanceof Rectangle) {
            System.out.println("rectangle Area: " + rectangle.getArea());
        } else if (figure instanceof Octagon) {
            System.out.println("Octagon Area: " + octagon.getArea());
        }
        System.out.println(ERROR);
    }

 private void createSquare(){
     System.out.println("Enter side: ");
     double side = scanner.nextDouble();
        square = new Square(side);
        System.out.println("Square created");
 }

  private void createCircle() {
        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();
        circle = new Circle(radius);
        System.out.println("Circle created");
    }

     private void createRectangle() {
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        rectangle = new Rectangle(width, height);
        System.out.println("Rectangle created!!");
    }

     private void createOctagon() {
        System.out.println("Enter side: ");
        double side = scanner.nextDouble();
        octagon = new Octagon(side);
        System.out.println("Octagon created!!");
    }

    private void showMenu() {
        System.out.println("*------------------------------------*");
        System.out.println("| 1.create square                    |");
        System.out.println("| 2.create circle                    |");
        System.out.println("| 3.create rectangle                 |");
        System.out.println("| 4.create octagon                   |");
        System.out.println("| 5.print perimeter                  |");
        System.out.println("| 6.print area                       |");
        System.out.println("| 7.print figure type                |");
        System.out.println("| 8. exit                            |");
        System.out.println("*------------------------------------*");
        System.out.println("select a number: ");
    }

}
