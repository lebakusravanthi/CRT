package jun6;

import java.util.ArrayList;

public class ArrayListOfCartoon {
    public static void main(String[] args) {

        
        ArrayList<String> characters = new ArrayList<>();
        characters.add("Mickey Mouse");
        characters.add("SpongeBob SquarePants");
        characters.add("Bugs Bunny");
        characters.add("Tom Cat");
        characters.add("Jerry Mouse");

        System.out.println("Original Cartoon Characters List:");
        for (String name : characters) {
            System.out.println(name);
        }
        characters.remove("Tom Cat");

        System.out.println("\nAfter removing 'Tom Cat':");
        for (String name : characters) {
            System.out.println(name);
        }

        characters.add("Scooby-Doo");

        System.out.println("\nAfter adding 'Scooby-Doo':");
        for (String name : characters) {
            System.out.println(name);
        }
    }
}