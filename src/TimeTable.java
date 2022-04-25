import java.util.List;

/**
 * Class TimeTable represents timetables(displays) on stations. It has only one method printSchedule() to show
 * departure and arrival time of a train.
 */
public class TimeTable {

    private final String way;

    public TimeTable(String way) {
        this.way = way;
    }

    public void printSchedule(List<Departure> departures) {
        System.out.println(way + ":");
        for (Departure departure : departures) {
            System.out.println(departure.getTrain().getName() + " arrival: " + departure.getExpectedArrivalTime().getHour() + ":" +
                    departure.getExpectedArrivalTime().getMinute());
        }
        System.out.println("-------------------------------------\n");
    }
}
