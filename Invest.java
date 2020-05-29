package com.company;

import java.util.ArrayList;

public class Invest implements Investment {
    private ArrayList <String> nameoftheprodutcs = new ArrayList<String>();
    private ArrayList<Double> price= new ArrayList<Double>();


    public void products(String nameoftheprodutcs,double priceofthisItem){
        this.nameoftheprodutcs.add(nameoftheprodutcs);
        this.price.add(priceofthisItem);
    }

    public void showAllproductsWithprice(){
        int num=1;
        for(int i=0; i<nameoftheprodutcs.size();i++) {
            if (!(nameoftheprodutcs.get(i) == null && price.get(i) == null)) {
                System.out.println(num++ + ". The product that sold is:-" + nameoftheprodutcs.get(i) + ". The price $" + price.get(i));
            }
        }
    }
    public void totalSail(){
        double sum=0;
        for(int i=0;i<price.size();i++){
            sum=price.get(i)+sum;
        }
        System.out.println(" THe total sail is $" + sum);


    }


}
