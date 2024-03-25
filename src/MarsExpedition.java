import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Pending.");
        Thread.sleep(500);
        System.out.println("Pending..");
        Thread.sleep(500);
        System.out.println("Pending...");
        Thread.sleep(500);
        System.out.println("Pending....");
        Thread.sleep(300);
        System.out.println("Ready :)");
        Thread.sleep(900);
        System.out.println("What is your name?");

        String name = input.nextLine();

        Thread.sleep(300);
        System.out.println("Glad to have you " + name + " you will be our new expedition leader! Are you ready to head out? Type Y or N");

        String answer = input.nextLine();


        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }



        System.out.println("How many people will you be taking?");

        int members = input.nextInt();
        input.nextLine();

        if (members > 2) {
            System.out.println("That's way to many people. We can only send 2 more members");
            members = 2;
        } else if (members < 2) {
            System.out.println("You have 2 empty slots for a reason FILL THEM!!!");
            members = 2;
        } else {
            System.out.println("Alright alright, we can work with this.");
        }

        System.out.println("you get a choice of one snack. What will it be?");

        String snack = input.nextLine();

        System.out.println("Really??? you want " + snack + ", kinda gross.");

        System.out.println("pick your mode of transport" + "\nA: The HMS Hood" + "\nB: A ~SPACE~ Horse" + "\nC: A Shoe (shared between the three of you)" + "\nD: A super lame spaceship");
        String vehicleChoice = input.nextLine();

        if (vehicleChoice.equalsIgnoreCase("A")) {
            vehicleChoice = "The HMS Hood";
        } else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicleChoice = "A ~SPACE~ Horse";
        } else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicleChoice = "A Shoe (shared between the three of you)";
        } else if (vehicleChoice.equalsIgnoreCase("D")) {
            vehicleChoice = "A super lame spaceship";
        }

        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + members + " members." +
                "\nTo explore the surface of Mars using " + vehicleChoice + " and eating " + snack +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nBlastoff!");





    }
}
