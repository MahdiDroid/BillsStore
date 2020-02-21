package com.company;

import java.util.ArrayList;
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
        this.additionCounter = 1;
        this.maxNumberOfAddition=4;
        this.additions = new ArrayList<>();

    }

    public void addAdditionToHamburger(Addition addition){
        if (additionCounter <= maxNumberOfAddition){
            additions.add(addition);
            additionCounter++;
            System.out.println(additionCounter);
        }else{
            System.out.println("you cannot add extra addition");
        }

    }

    public double getTotalPrice(){
        double totalPrice = basePrice;
            if (additions != null){
                for (var addition: additions
                ) {
                    totalPrice += addition.getPrice();
                }
            }
        return totalPrice;
    }

    public void getReceipt(){
        System.out.println(this.name +" : "+ this.basePrice );
        if (additions != null){
            for (var addition:additions
            ) {
                System.out.println( addition.getName() + " : " + addition.getPrice());
            }
        }
    }
    public void getAddition(){
        System.out.println(additions);
    }



}
