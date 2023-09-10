import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetAdoptionSystem{

    static class Pet {
        private String name;
        private String type;

        public Pet(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Type: " + type;
        }
    }

    public static void main(String[] args) {
        List<Pet> availablePets = new ArrayList<>();
        availablePets.add(new Pet("Fluffy", "Cat"));
        availablePets.add(new Pet("Buddy", "Dog"));
        availablePets.add(new Pet("Snowball", "Rabbit"));
        availablePets.add(new Pet("S", "fish"));

        System.out.println("Welcome to the Pet Adoption System!");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nAvailable Pets:");
            for (int i = 0; i < availablePets.size(); i++) {
                System.out.println((i + 1) + ". " + availablePets.get(i));
            }

            System.out.println("\nSelect a pet to adopt (enter index number) or enter 'q' to quit:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int selectedIndex = Integer.parseInt(input);

                if (selectedIndex >= 1 && selectedIndex <= availablePets.size()) {
                    Pet selectedPet = availablePets.remove(selectedIndex - 1);
                    System.out.println("\nCongratulations! You have adopted " + selectedPet.getName() + "!");
                } else {
                    System.out.println("\nInvalid index. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nInvalid input. Please try again.");
            }
        }

        scanner.close();

        System.out.println("\nThank you for using the Pet Adoption System. Goodbye!");
    }
}


