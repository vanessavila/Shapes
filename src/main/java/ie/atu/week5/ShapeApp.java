package ie.atu.week5;


import java.util.Scanner;

public class ShapeApp {

    public static void main(String[] args) {
       System.out.println("Please enter the length of the rectangle");
       Scanner input = new Scanner(System.in);
       double length = input.nextDouble();
       Rectangle shapeRect = new Rectangle();
       shapeRect.setLength(length);
       System.out.println("You entered : " + shapeRect.getLength());


       System.out.println("Please enter the width of the rectangle");
       double width = input.nextDouble();
       shapeRect.setWidth(width);
       System.out.println("You entered : " + shapeRect.getWidth());

       //create second instance of Rectangle
       System.out.println("Please enter the length of the rectangle");
       length = input.nextDouble();
       Rectangle shapeRect2 = new Rectangle();
       System.out.println("You entered : " + shapeRect2.getLength());
       shapeRect2.setLength(length);

       System.out.println("Please enter the width of the rectangle");
       width = input.nextDouble();
       shapeRect2.setWidth(width);
       System.out.println("You entered : " + shapeRect2.getWidth());


       }
}
