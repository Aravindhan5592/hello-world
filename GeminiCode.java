import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GeminiCode {
    public static void main(String[] args) {
        Map<String, String> userGroups = new HashMap<>();
        // Assuming names in the data file are like "aravindhan", "aravind"
        userGroups.put("aravindhan", "gdg cloud madurai");
        userGroups.put("aravind", "gdg madurai");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String inputName = scanner.nextLine();
        String group = userGroups.get(inputName.toLowerCase());
        if (group != null) {
            // Use the original inputName for display to preserve casing
            System.out.println("Welcome " + inputName + " from " + group + " to Hyderabad!");
        } else {
            System.out.println("Welcome " + inputName + " to Hyderabad!");
        }

        scanner.close(); // It's good practice to close the Scanner
    }
}