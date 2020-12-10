/*
(The Fan class) Design a class named Fan to represent a fan. The class contains:
 ■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
denote the fan speed.
 ■ A private int data field named speed that specifies the speed of the fan (the
default is SLOW).
 ■ A private boolean data field named on that specifies whether the fan is on (the
default is false).
 ■ A private double data field named radius that specifies the radius of the fan
(the default is 5).
 ■ A string data field named color that specifies the color of the fan (the default
is blue).
 ■ The accessor and mutator methods for all four data fields.
 ■ A no-arg constructor that creates a default fan.
 ■ A method named toString() that returns a string description for the fan. If
the fan is on, the method returns the fan speed, color, and radius in one combined string. If the fan is not on, the method returns the fan color and radius
along with the string “fan is off” in one combined string.
Draw the UML diagram for the class and then implement the class. Write a test
program that creates two Fan objects. Assign maximum speed, radius 10, color
yellow, and turn it on to the first object. Assign medium speed, radius 5, color
blue, and turn it off to the second object. Display the objects by invoking their
toString method.
 */

public class Exercise9_8Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");

        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.setSpeed(3);
        fan2.setRadius(5);
        fan2.setColor("blue");


        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}

class Fan {
    final int SLOW;
    final int MEDIUM;
    final int FAST;
    private int speed;
    private boolean on;
    private double radius;
    String color;

    /* A no-arg constructor that creates a default fan. */
    Fan() {
        SLOW = 1;
        MEDIUM = 2;
        FAST = 3;
        speed = 1;
        on = false;
        radius = 5;
        color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String toString() {
        if (speed == 1 && on) return "SLOW " + color + " " + radius;
        else if (speed == 2 && on) return "MEDIUM " + color + " " + radius;
        else if (speed == 3 && on) return "FAST " + color + " " + radius;
        else if(!on){
         return color + " " + radius + " fan is off";
        }
        return "";
    }
}
