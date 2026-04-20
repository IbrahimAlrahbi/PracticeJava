package understandStatic;

public class MainStudent {

    public static void main(String[] args){
        Student student1 = new Student(123,"Ali");
        //  static is not owned or reserved by anyone and can be called using class
        System.out.println(Student.college);
    }
}
