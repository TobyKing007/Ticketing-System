public class Event {

    private int id;
    private String name;
    private String location;
    private String date;
    private int availableSeats;

    public Event(int id, String name, String location, String date, int availableSeats) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.date = date;
        this.availableSeats = availableSeats;
    }

    public void displayEvent() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Available Seats: " + availableSeats);
        System.out.println("-------------------------");
    }
}
