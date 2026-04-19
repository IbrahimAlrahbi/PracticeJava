package constructor;

public class Product {
    private String name;
    private String description;
    private float price;
    private int quantity;
    private String color;

    //  Types of Constructors
    //  1. No-Arg Constructor
    public Product() {
        this.name = "No Name";
        this.description = "No description";
        this.quantity = 0;
        this.price = 0.0f;
    }

    //  2. Parametrized Constructor
    //  we should do overloading
    //  Make them unique, example by data type & number of Data Type
    public Product(String n, String d, float p, int q) {
        this.name = n;
        this.description = d;
        this.quantity = q;
        this.price = p;
    }

    public Product(String n, String d, float p, int q, String c) {
        this.name = n;
        this.description = d;
        this.quantity = q;
        this.price = p;
        this.color = c;
        // Instead of writing all of them again, from the constructor above we can use:
        //  this (n,d,p,q); its called constructor chaining read from the above constructor
        //  this.color;
    }

    //  3. Copy Constructor
    public Product(Product obj){
        this.name = obj.name;
        this.description = obj.description;
        this.quantity = obj.quantity;
        this.price = obj.price;
        this.color = obj.color;
    }

    public void display(){
        //  we can use toString, but this time different
        System.out.println("Name = " + name);
        System.out.println("Description = " + description);
        System.out.println("Price = " + price);
        System.out.println("Quantity " + quantity);


    }

}
