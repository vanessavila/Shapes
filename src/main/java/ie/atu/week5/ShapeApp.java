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
       System.out.println("Please enter the length of the second rectangle");
       length = input.nextDouble();
       Rectangle shapeRect2 = new Rectangle();
       shapeRect2.setLength(length);
       System.out.println("You entered : " + shapeRect2.getLength());


       System.out.println("Please enter the width of the second rectangle");
       width = input.nextDouble();

       shapeRect2.setWidth(width);
       System.out.println("You entered : " + shapeRect2.getWidth());

       //create a third instance of rectangle
       System.out.println("Please enter the length of the third rectangle");
       length = input.nextDouble();
       System.out.println("Please enter the width of the third rectangle");
       width = input.nextDouble();
       Rectangle shapeRect3 = new Rectangle(length, width);
       System.out.println("You entered : " + shapeRect3.getLength());
       System.out.println("You entered : " + shapeRect3.getWidth());
//test
       }
}
