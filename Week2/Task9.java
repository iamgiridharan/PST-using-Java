package Week2;
import java.time.LocalDate;

import java.util.*;

class Event {
    String name;
    LocalDate date;

    Event(String name, String dateStr) {
        this.name = name;
        this.date = LocalDate.parse(dateStr); // yyyy-MM-dd format
    }
}

public class Task9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Event> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String date = sc.next();
            events.add(new Event(name, date));
        }

        int month = sc.nextInt();

        // 1. Sort events chronologically
        events.sort(Comparator.comparing(e -> e.date));

        // Print sorted event names
        for (Event e : events) {
            System.out.print(e.name + " ");
        }
        System.out.println();

        // 2. Earliest event
        System.out.println(events.get(0).name);

        // 3. Latest event
        System.out.println(events.get(events.size() - 1).name);

        // 4. Events in given month
        for (Event e : events) {
            if (e.date.getMonthValue() == month) {
                System.out.print(e.name + " ");
            }
        }
    }
}