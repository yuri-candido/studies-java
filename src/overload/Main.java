package src.overload;

// using overloading
public class Main {
    public static void main(String[] args) {

    Person p = new Person();
    Person p1 = new Person("Person1", "programmer", 6000.00 , 35);
    Person p2 = new Person("Person2" , "programmer" , 5000.00);

    System.out.println(p);
    System.out.println(p1);
    System.out.println(p2);

    }
}
