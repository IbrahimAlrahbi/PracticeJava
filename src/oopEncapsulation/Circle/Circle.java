package oopEncapsulation.Circle;

public class Circle {
    private double radius;
    private String color;

    //  If we have a large number of circles, we have a shortcut to do get & set
    //  right click, insert code, insert get & set
    public void setRadius(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }

    public void setColor(String c){
        color = c;
    }
    public String getColor(){
        return color;
    }

    public double getArea(){
        // return 3.14 * radius * radius;
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return Math.PI * 2 * radius;
    }

    //toString
    public String toString(){
        return "Circle{" + radius + ", color=" + color + '}';
    }

}

