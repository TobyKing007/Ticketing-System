import java.util.ArrayList;
public class CreateEvent        {

private static ArrayList<String> eventNames = new ArrayList<>();
private static ArrayList<String> locations = new ArrayList<>();
private static ArrayList<String> dates = new ArrayList<>();
private static ArrayList<String> times = new ArrayList<>();
private static ArrayList<Integer> seatsList = new ArrayList<>();

    public static void event(int availableSeats, String eventName, String location, String date, String time)     {

    
    if (availableSeats < 0)     {
       System.out.println ("Invalid input");
        return;
          }
    
    if (eventName.isEmpty() || location.isEmpty() || date.isEmpty() || time.isEmpty())      {
        System.out.println("Invalid input. Event details cannot be empty");
        return;

                    }

        eventNames.add(eventName);
        locations.add(location);
        dates.add(date);
        times.add(time);
        seatsList.add(availableSeats);

        System.out.println("Event created successfully!");
        System.out.println("Name: " + eventName);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Available Seats: " + availableSeats);


        }

    }







        
