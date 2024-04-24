package src.lists.exercise01.main;

import src.lists.exercise01.entitie.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    List<Employee> list = new ArrayList<>(0);
    Scanner sc = new Scanner(System.in);

    Employee employee = new Employee(1,"Person1", 2000.00);
    Employee employee2 = new Employee(2,"Person2", 4000.00);
    Employee employee3 = new Employee(3,"Person3", 8000.00);

    list.add(employee);
    list.add(employee2);
    list.add(employee3);

    System.out.println("Enter the employee id that will have salary increase: ");
    int id = sc.nextInt();

    boolean idExists = false;

    for (Employee x : list) {
        if(x.getId() == id){
            System.out.println("Enter the salary increment percentage: ");
            double percentage = sc.nextDouble();
            x.setSalary(percentage);
            System.out.println("the new salary is: " + x.getSalary());
            idExists = true;
            return;
        }
    }

    if(!idExists) {
        System.out.println("The id entered doesn't exist!");
        for (Employee y : list) {
            System.out.println(y);
        }
    }

    }
}
