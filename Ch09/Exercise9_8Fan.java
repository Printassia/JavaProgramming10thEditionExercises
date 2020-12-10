package Horsy.com.company.Ch09;

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
