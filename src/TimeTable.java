import java.util.List;

public class TimeTable {

    private final String way;

    public TimeTable(String way) {
        this.way = way;
    }

    public void printSchedule(List<Departure> departures) {
        System.out.println(way + ":");
        for (Departure departure : departures) {
            System.out.println(departure.getTrain().getName() + ": " + departure.getExpectedArrivalTime());
        }
        System.out.println("-------------------------------------\n");
    }
}
