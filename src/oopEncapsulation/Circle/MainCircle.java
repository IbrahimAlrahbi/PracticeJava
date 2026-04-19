package oopEncapsulation.Circle;

public class MainCircle {
    public static void main(String args[]){
        Circle c1 = new Circle();
        c1.setRadius(3.0);
        c1.setColor("Black");
        System.out.println("C1 area = " + c1.getArea());

        Circle c2 = new Circle();
        c2.setRadius(2.0);
        c2.setColor("Blue");
        System.out.println("C2 Circumference = " + c2.getCircumference());


    }
}

