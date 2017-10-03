/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Praktikum
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        class Employee implements Comparable<Employee> {
            private String name;
            private double salary;
            public Employee(String name, double salary) {
                this.name = name;
                this.salary = salary;
            }
            @Override
            public String toString() {
                return "Employee{" + "name=" + name + ", salary=" + salary;
            }

            @Override
            public int compareTo(Employee o) {
                return name.compareTo(o.name);
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setSalary(double salary) {
                this.salary = salary;
            }

            public String getName() {
                return name;
            }

            public double getSalary() {
                return salary;
            }
            
            
        }
        List<Employee> l = new ArrayList();
        l.add(new Employee("Bobby", 5));
        l.add(new Employee("Erick", 56));
        l.add(new Employee("Anna", 15));
        l.add(new Employee("Rey", 25));
        Collections.sort(l);
        for(Employee s: l) {
            System.out.println(s);
        }
    }
}
