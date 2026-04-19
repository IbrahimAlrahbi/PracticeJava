package oopEncapsulation.Car;

public class MainCar {
    public static void main(String[] args){
        // Creating first object. the class then the name of the object "Car obj;"
        // then reserve a place in memory using "new"
        // objects are " car1 & car2 "

        // Object #1
        Car car1 = new Car();
        car1.name = "Tesla";
        System.out.println(car1.name);
        car1.maxSpeed = 202;
        System.out.println(car1.maxSpeed);

        // Object #2
        Car car2 = new Car();
        car2.name = "Corolla";
        System.out.println(car2.name);
        car2.maxSpeed = 300;
        System.out.println(car2.maxSpeed);

        // Using set & get

        Car car3 = new Car();
        car3.name = "Tesla";
        int m = 2014;
        car3.setModel(2021);
        System.out.println(car3.name);
        System.out.println(car3.model);


    }
}

