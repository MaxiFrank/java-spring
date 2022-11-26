package src;

public class Mars {
    public static void main (String[] args) throws InterruptedException {
        String colonyName = "Mars";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        int numberOfDaysLanding = 2;

        meals = meals - numberOfDaysLanding * (shipPopulation * 0.75);
        System.out.println("there are " + meals + " meals left");

        double crateOfFoodIncrease = 0.5;

        meals = meals * (1+crateOfFoodIncrease);

        int babies = 5;

        shipPopulation+=babies;

        String landingLocation = "The Plain";

        if (landingLocation == "The Hill") {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        landing = landingCheck(10);
    }

    public static Boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int i=0; i < minutesLeft; i++) {
            System.out.println("Don't launch");
            if (i % 2 == 0) {
                System.out.println("Right");
            }
            if (i % 3 == 0) {
                System.out.println("Left");
            }
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("Keep Center");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}
