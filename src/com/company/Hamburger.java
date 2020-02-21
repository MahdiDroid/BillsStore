package com.company;

import java.util.List;

public class Hamburger {
    private String name ;
    private String meat;
    private double basePrice;
    private String breadRoll;
    private List<Addition> additions;
    private int maxNumberOfAddition;
    private int additionCounter;

    public Hamburger(String name, String meat, double basePrice, String breadRoll) {
        this.name = name;
        this.meat = meat;
        this.basePrice = basePrice;
        this.breadRoll = breadRoll;
    }

    public void addAdditionToHamburger(Addition addition){
        if (additionCounter <= maxNumberOfAddition){
            additions.add(addition);
            additionCounter++;
        }else{
            System.out.println("you cannot add extra addition");
        }

    }

    public double totalPrice(){
        double totalPrice = basePrice;
        for (var addition: additions
             ) {
            totalPrice += addition.getPrice();
        }
        return totalPrice;
    }

    public void getReceipt(){
        String receit = this.name +" : "+ this.basePrice +"\n";
        for (var addition:additions
             ) {
            receit += addition.getName() + " : " + addition.getPrice()+ "\n";
        }
        System.out.println(receit);
    }



}
