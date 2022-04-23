import java.time.LocalDate;

public class Departure {
    private LocalDate departedTime;
    private LocalDate expectedArrivalTime;
    private Train train;
    private Station toStation;

    public Departure(LocalDate departedTime, LocalDate expectedArrivalTime, Train train, Station toStation){
        this.departedTime = departedTime;
        this.expectedArrivalTime = expectedArrivalTime;
        this.train = train;
        this.toStation = toStation;
    }
}
