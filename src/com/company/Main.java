package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Hamburger hamburger = new Hamburger("basic","chicken",2.5,"white");
//        System.out.println(hamburger.getTotalPrice());
//        hamburger.getReceipt();
//
//        hamburger.addAdditionToHamburger(new Addition("Tomato",1.2));
//        hamburger.addAdditionToHamburger(new Addition("Potato",0.82));
//        hamburger.addAdditionToHamburger(new Addition("cheese",1.99));
//        hamburger.addAdditionToHamburger(new Addition("lotus",1.12));
//        hamburger.addAdditionToHamburger(new Addition("mimi",10.12));
//      //  hamburger.addAdditionToHamburger(new Addition("lali",6.12));
//        System.out.println("---------------------------------------");
//        hamburger.getReceipt();
//        System.out.println(hamburger.getTotalPrice());
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        var healthyHamburger = new HealthyBurger(3.4, 6);
        System.out.println(healthyHamburger.getTotalPrice());
        healthyHamburger.getReceipt();
        healthyHamburger.addAdditionToHamburger(new Addition("Tomato",1.2));
        healthyHamburger.addAdditionToHamburger(new Addition("cheese",1.99));
        healthyHamburger.addAdditionToHamburger(new Addition("lotus",1.12));
        healthyHamburger.addAdditionToHamburger(new Addition("mimi",10.12));
        healthyHamburger.addAdditionToHamburger(new Addition("Potato",0.82));
        healthyHamburger.addAdditionToHamburger(new Addition("doubleBread",4.82));
       //healthyHamburger.addAdditionToHamburger(new Addition("Mashroom",0.82));

        System.out.println("---------------------------------------");
        healthyHamburger.getReceipt();
        System.out.println(healthyHamburger.getTotalPrice());
    }
}
