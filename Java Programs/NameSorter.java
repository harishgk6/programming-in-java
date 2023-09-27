import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        System.out.println("Enter names (press Enter to finish):");
        while (true) {
            String name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                break;
            }
            names.add(name);
        }
        System.out.print("Enter sorting order (A for ascending, D for descending): ");
        String sortOrder = scanner.nextLine().trim();

        if (sortOrder.equalsIgnoreCase("A")) {
            Collections.sort(names);
        } else if (sortOrder.equalsIgnoreCase("D")) {
            Collections.sort(names, Collections.reverseOrder());
        } else {
            System.out.println("Invalid sorting order input. Please use 'A' for ascending or 'D' for descending.");
            return;
        }
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
