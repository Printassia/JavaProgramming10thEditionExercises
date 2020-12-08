package Horsy.com.company.Ch09;

/*
(The Rectangle class) Following the example of the Circle class in Section 9.2,
design a class named Rectangle to represent a rectangle. The class contains:
 ■ Two double data fields named width and height that specify the width and
height of the rectangle. The default values are 1 for both width and height.
 ■ A no-arg constructor that creates a default rectangle.
 ■ A constructor that creates a rectangle with the specified width and height.
 ■ A method named getArea() that returns the area of this rectangle.
 ■ A method named getPerimeter() that returns the perimeter.
Draw the UML diagram for the class and then implement the class. Write a test
program that creates two Rectangle objects—one with width 4 and height 40
and the other with width 3.5 and height 35.9. Display the width, height, area,
and perimeter of each rectangle in this order.
 */

public class Exercise9_1Rectangle {
    /** Main method to display output
     * Write a test
     * program that creates two Rectangle objects—one with width 4 and height 40
     * and the other with width 3.5 and height 35.9. Display the width, height, area,
     * and perimeter of each rectangle in this order */
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4,40);
        Rectangle rect2 = new Rectangle(3.5,35.9);
        
        System.out.println("Rectangle 1 width is " + rect1.width + " & its height " +
                "is " + rect1.height);
        System.out.printf("Rectangle 1 area is %.2f \n" , rect1.getArea());
        System.out.printf("Rectangle 1 perimeter is %.2f" , rect1.getPerimeter());

        //New Line
        System.out.println();

        System.out.println("Rectangle 2 width is " + rect2.width + " & its height " +
                "is " + rect2.height);
        System.out.printf("Rectangle 2 area is %.2f \n" , rect2.getArea());
        System.out.printf("Rectangle 2 perimeter is %.2f" , rect2.getPerimeter());
    }
}

class Rectangle{
//    Two double data fields named width and height that specify the width and
//    height of the rectangle. The default values are 1 for both width and height.
    double width = 1;
    double height = 1;

/*    A no-arg constructor that creates a default rectangle.*/
    public Rectangle(){

    }

/*    A constructor that creates a rectangle with the specified width and height.*/
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

/*    A method named getArea() that returns the area of this rectangle.*/
    public double getArea(){
        double area = width * height;
        return area;
    }

/*    A method named getPerimeter() that returns the perimeter.*/
    public double getPerimeter(){
        double perimeter = 2 * (width + height);
        return perimeter;
    }
}
