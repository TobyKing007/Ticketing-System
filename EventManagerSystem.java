import java.util.Scanner;

public class EventManagerSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        EventManager manager = new EventManager();

        System.out.println("Press 1 to create event");
        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {

            System.out.print("Enter Event Name: ");
            String name = input.nextLine();

            System.out.print("Enter Location: ");
            String location = input.nextLine();

            System.out.print("Enter Date: ");
            String date = input.nextLine();

            System.out.print("Enter Number of Seats: ");
            int seats = input.nextInt();
            input.nextLine();

            manager.createEvent(name, location, date, seats);
        }

        
    }
}
