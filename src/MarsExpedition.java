package src;

import java.util.Scanner;

public class MarsExpedition {

    public static void main (String[] args) {
        new MarsExpedition();
    }

    public MarsExpedition() {
        Scanner input = new Scanner(System.in);
        System.out.println("Starting");

        System.out.println("What is your name?");

        String name = input.nextLine();

        System.out.println("Hi, " + name + " — Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");

        String answer = input.nextLine();

        if (answer.equals("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
            System.out.println("How many people do you want on your team?");
            Integer numPeople = Integer.parseInt(input.nextLine());
            if (numPeople != 2) {
                System.out.println("That’s way to many people. We can only send 2 more members.");
                numPeople = 2;
            }

            System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
            String snacks = input.nextLine();
            System.out.println("Nice choice, you will be bringing a " + snacks + " with you.");

            System.out.println("You have the choice of 3 vehicles: A.a, B.b, C.c");
            String vehicle = input.nextLine();
            if (vehicle.startsWith("A")) {
                vehicle = "a";
            } if (vehicle.startsWith("B")) {
                vehicle = "b";
            } if (vehicle.startsWith("C")){
                vehicle = "c";
            }

            System.out.println("Your team is lead by " + name + " size " + numPeople + " vehicle choice " + vehicle);
        } if (answer.equals("N")) {
            System.out.println("Too bad you are team leader. You have to go.");
        }
    }
}
