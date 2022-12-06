package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class Cupcake {
    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type(){
        System.out.println("A basic, generic cupcake, with vanilaa frosting");
    }
}

class RedVelvet extends Cupcake {
    public void type() {
        System.out.println("A red velvet cupcake");
    }
}


class Chocolate extends Cupcake {
    public void type() {
        System.out.println("A chocolate cupcake");
    }
}

class Drink {
    public Double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type() {
        System.out.println("A basic, generic drink");
    }
}

class Soda extends Drink {
    public void type() {
        System.out.println("A soda");
    }
}

class Milk extends Drink {
    public void type() {
        System.out.println("A bottle of milk");
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        Cupcake cupcake = new Cupcake();

        RedVelvet redVelvet = new RedVelvet();

        Chocolate chocolate = new Chocolate();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing");

        Scanner customerInput = new Scanner(System.in);

        //        standard cupcake

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description");

        cupcake.type();

        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");

        String priceText = customerInput.nextLine();

        Double price = Double.parseDouble(priceText);

        cupcake.setPrice(price);

        // red velvet cupcake

        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description");

        redVelvet.type();

        System.out.println("How much would you like to charge for the red velvet cupcake? (Input a numerical number taken to 2 decimal places)");

        String redVelvetPriceText = customerInput.nextLine();

        Double redVelvetPrice = Double.parseDouble(redVelvetPriceText);

        redVelvet.setPrice(redVelvetPrice);

        // chocolate cupcake

        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description");

        redVelvet.type();

        System.out.println("How much would you like to charge for the chocolate cupcake? (Input a numerical number taken to 2 decimal places)");

        String chocolatePriceText = customerInput.nextLine();

        Double chocolatePrice = Double.parseDouble(chocolatePriceText);

        chocolate.setPrice(chocolatePrice);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);


        System.out.println(cupcake.getPrice());
        System.out.println(redVelvet.getPrice());
        System.out.println(chocolate.getPrice());

        //        Drinks class

        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();

        Drink water = new Drink();

        Soda soda = new Soda();

        Milk milk = new Milk();

        // Water

        System.out.println("We are in the middle of creating the drinks menu. We currently have three cupcakes on the menu but we need to decide on pricing");

        //        standard cupcake

        System.out.println("We are deciding on the price for our standard drink. Here is the description");

        water.type();

        System.out.println("How much would you like to charge for the water? (Input a numerical number taken to 2 decimal places)");

        String waterText = customerInput.nextLine();

        Double waterPrice = Double.parseDouble(waterText);

        water.setPrice(waterPrice);

        // soda

        System.out.println("We are deciding on the price for our soda. Here is the description");

        soda.type();

        System.out.println("How much would you like to charge for the soda? (Input a numerical number taken to 2 decimal places)");

        String sodaPriceText = customerInput.nextLine();

        Double sodaPrice = Double.parseDouble(sodaPriceText);

        soda.setPrice(sodaPrice);

        // milk

        System.out.println("We are deciding on the price for milk. Here is the description");

        milk.type();

        System.out.println("How much would you like to charge for the milk? (Input a numerical number taken to 2 decimal places)");

        String milkPriceText = customerInput.nextLine();

        Double milkPrice = Double.parseDouble(milkPriceText);

        milk.setPrice(milkPrice);

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);


        System.out.println(water.getPrice());
        System.out.println(soda.getPrice());
        System.out.println(milk.getPrice());

        ArrayList<Object> order = new ArrayList<Object>(cupcakeMenu);
        order.add(drinkMenu);

        new CreateFile();
//        need to cast order to a list of array objects
        new WriteToFile(order);
    }

}
