import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> firstList = new ArrayList<>();
        List<String> secondList = new ArrayList<>();
        List<String> repeatedElementsFromLists = new ArrayList<>();

        System.out.println("Let's add some fruits to the first list");
        System.out.println("=====================================");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Press ENTER to start!");
            String command = scanner.nextLine();

            while (command.equals("") || command.equals("Y") || command.equals("y")) {
                System.out.print("Enter a fruit: ");
                String fruit = scanner.nextLine();

                firstList.add(fruit);

                System.out.println("Do you want to add more fruits? (Y/n)");
                command = scanner.nextLine();
            }

            System.out.println();
            System.out.println("Nice! Now let's add some fruits to the second list");
            System.out.println("=====================================");

            System.out.println("Press ENTER to start!");
            String secondCommand = scanner.nextLine();

            System.out.println(secondCommand);

            while (secondCommand.equals("") || secondCommand.equals("Y") || secondCommand.equals("y")) {
                System.out.print("Enter a fruit: ");
                String fruit = scanner.nextLine();

                secondList.add(fruit);

                System.out.println("Do you want to add more fruits? (Y/n)");
                secondCommand = scanner.nextLine();
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        for (String fruit : firstList) {
            if (secondList.contains(fruit)) {
                repeatedElementsFromLists.add(fruit);
            }
        }

        System.out.println();
        if (repeatedElementsFromLists.size() == 0) {
            System.out.println("There are no repeated elements between the lists");
        } else {
            System.out.println("There are repeated elements between the lists");
            System.out.println("Here are the repeated elements: " + repeatedElementsFromLists);
        }
    }
}
