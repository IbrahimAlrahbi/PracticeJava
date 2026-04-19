package oopEncapsulation.Car;

public class Car {

    //  Access Modifiers " public, private, protected"
    //  public: you can acceess from any class; outside the class "Car"
    //  private: you cannot access, only inside the class; between the {} of "Car"
    String name;
    int maxSpeed;
    float price;
    int model;


    // Name
    void setName(String n){

        name = n;
    }

    String getName(){
        return name;
    }

    // Model
    void setModel(int m){
        if (m >= 2015) {
            model = m;
        } else {
            System.out.println("We Don't Accept this Model");
        }
    }
    int getModel(){
        return model;
    }

}

