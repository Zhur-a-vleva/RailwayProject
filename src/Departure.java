import java.time.LocalDate;

public class Departure {
    private LocalDate departedTime;
    private LocalDate expectedArrivalTime;
    private Train train;
    private Station fromStation;
    private Station toStation;

    public Departure(String departedTime, String expectedArrivalTime, Train train, Station fromStation, Station toStation){
        this.departedTime = LocalDate.parse(departedTime, GlobalInfo.dtf);
        this.expectedArrivalTime = LocalDate.parse(expectedArrivalTime, GlobalInfo.dtf);
        this.train = train;
        this.fromStation = fromStation;
        this.toStation = toStation;
    }

    public LocalDate getDepartedTime(){
        return this.departedTime;
    }

    public Station getToStation() {
        return toStation;
    }

    public Station getFromStation() {
        return fromStation;
    }

    public LocalDate getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    public Train getTrain() {
        return train;
    }
}
