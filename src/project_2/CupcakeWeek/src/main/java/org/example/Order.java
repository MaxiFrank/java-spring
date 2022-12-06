package org.example;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Order {
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {
        System.out.println("Hello customer. Would you like to place an order? (Y or N).");
        Scanner customerInput = new Scanner(System.in);
        String placeOrder = customerInput.nextLine();

        ArrayList<Object> order = new ArrayList<Object>();

        if (placeOrder.equals("Y")) {
            order.add(LocalDate.now());
            order.add(LocalTime.now());
            System.out.println("Here is the menu");
            System.out.println("CUPCAKES");
            int itemNumber = 0;
            for (int i = 0; i < cupcakeMenu.size(); i++) {
                itemNumber++;
                System.out.println(itemNumber);
                cupcakeMenu.get(i).type();
                System.out.println("Price" + cupcakeMenu.get(i).getPrice());

            }
            System.out.println("DRINKS");
            for (int i = 0; i < drinkMenu.size(); i++) {
                itemNumber++;
                System.out.println(itemNumber);
                drinkMenu.get(i).type();
                System.out.println("Price" + drinkMenu.get(i).getPrice());
                System.out.println("DRINKS");
            }
        } else {
            System.out.println("Have a nice day then");
        }

        boolean ordering = true;

        while (ordering) {
            System.out.println("What would you like to order? Please use the number associated with each item to order");
            int orderChoice = customerInput.nextInt();
            System.out.println(cupcakeMenu);
            System.out.println(orderChoice);
            customerInput.nextLine();

            if (orderChoice == 1) {
                order.add(cupcakeMenu.get(0));
                System.out.println("Item added to order");
            } else if (orderChoice == 2) {
                order.add(cupcakeMenu.get(1));
                System.out.println("Item added to order");
            } else if (orderChoice == 3) {
                order.add(cupcakeMenu.get(2));
                System.out.println("Item added to order");
            } else if (orderChoice == 4) {
                order.add(drinkMenu.get(0));
                System.out.println("Item added to order");
            } else if (orderChoice == 5) {
                order.add(drinkMenu.get(1));
                System.out.println("Item added to order");
            } else if (orderChoice == 6) {
                order.add(drinkMenu.get(2));
                System.out.println("Item added to order");
            } else {
                System.out.println("Sorry, we don’t seem to have that on the menu.");
            }
            System.out.println("Would you like to continue ordering? (Y/N)");
            placeOrder = customerInput.nextLine();

            if (!placeOrder.equals("Y")) {
                ordering = false;
            }
        }

        System.out.println(order.get(0));

        System.out.println(order.get(1));

        Double subtotal = 0.0;

        HashMap<Cupcake, Double> cakes = new HashMap<>();
        for (int i = 0; i < cupcakeMenu.size(); i++) {
            cakes.put(cupcakeMenu.get(i), cupcakeMenu.get(i).getPrice());
        }

        System.out.println("cakes are" + cakes);

        HashMap<Drink, Double> drinks = new HashMap<>();
        for (int i = 0; i < drinkMenu.size(); i++) {
            drinks.put(drinkMenu.get(i), drinkMenu.get(i).getPrice());
        }
        System.out.println("drinks are" + drinks);

        for (int i = 0; i < order.size(); i++) {
            if (order.get(i) instanceof Cupcake) {
                subtotal += cakes.get(order.get(i));
            } else if (order.get(i) instanceof Drink) {
                subtotal += drinks.get(order.get(i));
            }
            System.out.println("subtotal is " + subtotal);

            System.out.println("orders are" + order);


        }
    }
}
