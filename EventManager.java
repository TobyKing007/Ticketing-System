import java.util.ArrayList;

    public class EventManager   {

        private ArrayList <Event> events = new ArrayList<>();
        private int id = 1;
        public void createEvent(String name, String location, String date, int seats) {

        if (name.isEmpty() || location.isEmpty() || date.isEmpty()) {
            System.out.println("Error: Fields cannot be empty.");
            return;
        }

        if (seats <= 0) {
            System.out.println("Error: Seats must be greater than 0.");
            return;
        }

        Event event = new Event(id++, name, location, date, seats);
        events.add(event);

        System.out.println("Event created successfully!");
    }
}


