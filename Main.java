package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String yesorno; int totalHour; double hourlyrate; String response;
        Employee details = new Employee();
        Invest saildetail=new Invest();
//Employee

        do {
            System.out.println(" Type your emplpyee name");
            String name = scanner.next();
            System.out.println("How many total hours they worked in a week!");
            totalHour = scanner.nextInt();
            System.out.println("Type the hourly rate.");
            hourlyrate = scanner.nextDouble();
            details.employeeDetails(name, totalHour);
            details.emplyeeCost(hourlyrate);

            System.out.println("Again:- Yes or NO\n");
            response=scanner.next();

        } while (response.equalsIgnoreCase("yes"));
        details.allemployedetails();
        details.TotalCost();
//Investment
        String productname; Double price;
        do {
            System.out.println("Type the product name:-");
            productname = scanner.next();
            System.out.println("What is the price");
            price = scanner.nextDouble();
            saildetail.products(productname,price);
            System.out.println("Again:- Yes or NO");
            response=scanner.next();

        }
        while (response.equalsIgnoreCase("yes"));
        saildetail.showAllproductsWithprice();
        saildetail.totalSail();

    }
}
