package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsList {

    public static void main (String[] args) throws InterruptedException {
        new FindingsList();
    }


    public FindingsList() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Welcome");

        ArrayList<String> rocks = new ArrayList<String>();

        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not rock");

        System.out.println(rocks);

        rocks.remove("not rock");
        System.out.println(rocks + " perfect");

        Thread.sleep(1000);

        HashMap<String, String> fossils = new HashMap<>();

        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Fossil data downloaded");

        System.out.println("Which of the fossils would you like to learn more about? (Bird, Fish, or Tooth)");

        Scanner input = new Scanner(System.in);

        String fossil = input.nextLine();

        if (fossil.equals("Bird")) {
            System.out.println(fossils.get("Bird Fossil"));
        } if (fossil.equals("Fish")) {
            System.out.println(fossils.get("Fish Fossil"));
        } if (fossil.equals("Tooth")) {
            System.out.println(fossils.get("Tooth Fossil"));
        }

        Thread.sleep(700);
        HashSet<String> supplies = new HashSet<>();

        supplies.add("A");
        supplies.add("B");
        supplies.add("C");

        System.out.println("Supplies Before Expedition" + supplies);

        supplies.remove("A");
        System.out.println("Supplies After Expedition" + supplies);



    }
}
