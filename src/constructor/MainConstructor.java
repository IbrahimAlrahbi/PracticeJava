package constructor;

public class MainConstructor {
    public static void main(String[] args){
        //  it will match the arguments and print the same
        Product p1 = new Product("Camera", "Auto focus...", 99,10);
        Product p2 = new Product(); //  it will match and read, print from it

        //  Sometimes I need to copy from p1 - Copy Constructors
        Product p3 = new Product(p1);
        p1.display();
        p2.display();


    }
}
