import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LogicalAndAssignmentOperators {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String firstName = "", lastName = "";
        byte age;
        boolean married;
        double size;

        System.out.println("What is your first name?");
        firstName = s.nextLine();
        System.out.println("What is your last name?");
        lastName = s.nextLine();
        System.out.println("How old are you?");
        age = s.nextByte();
        System.out.println("Are you married? (true/false)");
        married = s.nextBoolean();
        System.out.println("What's your size in meters?");
        size = s.nextDouble();

        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("You are " + age + " years old");
        System.out.printf("To say you are married is %b", married);
        System.out.println();
        System.out.printf("Your size is %.2f meter", size);
        System.out.println("\n");

        // Bonus 1:
        // to clear the input from \n
        firstName = s.nextLine();

        System.out.println("Bonus:");
        System.out.println("What is your name?");
        String name = s.nextLine();
        String[] help = name.split(" ", 2);

        firstName = help[0];
        lastName = help[1];

        System.out.println();
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);

        // Bonus 2:
        System.out.println();
        System.out.println("Date of birth? (day.month.year)");
        String dateInput = s.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date date = sdf.parse(dateInput);
            System.out.print("Birthday: " + sdf.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}