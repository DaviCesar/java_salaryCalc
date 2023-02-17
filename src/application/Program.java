package application;

import java.util.Scanner;

import entities.Employee;

import java.util.Locale;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee);

        System.out.println();
        System.out.print("Which percentage do you want to increase salary? ");
        double percent = sc.nextDouble();
        employee.increaseSalary(percent);

        System.out.println();
        System.out.print("UPDATED DATA: " + employee);
        System.out.println();


        sc.close();
    }
}
