import java.util.List;

public class TimeTable {

    public void printSchedule(List<Departure> departures) {
        for (Departure departure : departures) {
            System.out.println(departure.getTrain().getName() + ": " + departure.getExpectedArrivalTime());
        }
    }
}
