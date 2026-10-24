
import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstNames = {"John", "Emma", "Alex", "Sara", "David"};
        String[] lastNames = {"Smith", "Brown", "Wilson", "Taylor", "Johnson"};

        System.out.print("How many names? ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            int first = (int) (Math.random() * firstNames.length);
            int last = (int) (Math.random() * lastNames.length);

            System.out.println(firstNames[first] + " " + lastNames[last]);
        }
    }
}
