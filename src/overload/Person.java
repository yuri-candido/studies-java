package src.overload;

public class Person {

    String name;
    String office;
    double salary;
    int age;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getOffice() {

        return office;
    }

    public void setOffice(String office) {

        this.office = office;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    @Override
    public String toString() {

        return "entage{" +
                "nome='" + name + '\'' +
                ", Office='" + office + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public Person(String name, String office, double salary, int age) {

        this.name = name;
        this.office = office;
        this.salary = salary;
        this.age = age;
    }

    public Person(String name, String office, double salary) {

        this.name = name;
        this.office = office;
        this.salary = salary;
    }

    public Person() {

    }




}
