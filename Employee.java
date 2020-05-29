package com.company;


import java.util.ArrayList;

public class Employee implements labor {
    private ArrayList<String> names= new ArrayList<String>();
    private ArrayList<Integer> hours= new ArrayList<Integer>();
    private ArrayList<Double> rates=new ArrayList<Double>();

    public void employeeDetails(String name, int totalHours) {
        names.add(name);
        hours.add(totalHours);
    }
    public void emplyeeCost(double rate) {
        rates.add(rate);

    }
    public void allemployedetails(){
        int j=1;
        for(int i=0; i<names.size();i++){
            if(!(names.get(i)==null&&hours.get(i)==null&&rates.get(i)==null)){
                System.out.println(j+++".Employee name:-" + names.get(i)+". Weekly He works "+ hours.get(i)+" Hours." + " And their salary per hour $"+rates.get(i));
            }
        }
        System.out.println("---->The total employee:"+ names.size()+" people. \n");

    }
    public void TotalCost(){
        int totalHours=0;
        double totalCOst=0;
        for(int i=0; i<hours.size();i++){
            totalHours=totalHours+hours.get(i);
        }
        System.out.println("---->The totalHour is "+ totalHours+ " Hours");

        for(int i=0; i<rates.size(); i++){
            totalCOst=(hours.get(i)*rates.get(i))+totalCOst;
        }
        System.out.printf("---->The total Labor Cost:- $%.2f \n", totalCOst);

        System.out.println(" ");



    }


}
