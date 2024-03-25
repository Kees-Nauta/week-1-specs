import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class FindingsList {
    public FindingsList() {
        System.out.println("Storing samples");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Expedition Time");
        System.out.println("Storing all the samples");

        System.out.println("Welcome back!");

        System.out.println("Creating array to store rocks");
        ArrayList<String> rocks = new ArrayList<>();
        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not rock");

        System.out.println("Confirming download and printing list of rocks:");
        System.out.println(rocks);


        if (rocks.contains("not rock")) {
            System.out.println("Computer realizes there's a non-rock in the list.");
            System.out.println("Removing 'not rock' from the list.");
            rocks.remove("not rock");
        }
        System.out.println("List after removal: " + rocks);
        System.out.println("Perfect!");


        System.out.println("Loading Time - Fossil data");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Storing fossils");
        HashMap<String, String> fossils = new HashMap<>();
        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Fossil data downloaded");


        System.out.println("Fossil information");
        System.out.println("Which of the fossils would you like to learn more about? (Bird, fish, or tooth)");
        String choice = "Bird";
        if (fossils.containsKey(choice + " Fossil")) {
            System.out.println(fossils.get(choice + " Fossil"));
        }


        System.out.println("Loading Time - Special supplies");
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Supplies brought");
        HashSet<String> supplies = new HashSet<>();
        supplies.add("Special item 1");
        supplies.add("Special item 2");
        supplies.add("Special item 3");

        System.out.println("Supplies Before Expedition: " + supplies);


        supplies.remove("Special item 2");

        System.out.println("Supplies After Expedition: " + supplies);
    }

    public static void main(String[] args) {
        new FindingsList();
    }
}
