import java.time.LocalDate;

public class Departure {
    private final LocalDate departedTime;
    private final LocalDate expectedArrivalTime;
    private final Train train;
    private final Station fromStation;
    private final Station toStation;

    public Departure(String departedTime, String expectedArrivalTime, Train train, Station fromStation, Station toStation) {
        this.departedTime = LocalDate.parse(departedTime, GlobalInfo.getDtf());
        this.expectedArrivalTime = LocalDate.parse(expectedArrivalTime, GlobalInfo.getDtf());
        this.train = train;
        this.fromStation = fromStation;
        this.toStation = toStation;
    }

    public LocalDate getDepartedTime() {
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
