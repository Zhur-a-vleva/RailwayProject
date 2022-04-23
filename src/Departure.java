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

    public LocalDate getDepartedTime(){
        return this.departedTime;
    }

    public Station getToStation() {
        return toStation;
    }

    public LocalDate getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    public Train getTrain() {
        return train;
    }
}
