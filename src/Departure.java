import java.time.LocalDateTime;

public class Departure {
    private final LocalDateTime departedTime;
    private final LocalDateTime expectedArrivalTime;
    private final Train train;
    private final Station fromStation;
    private final Station toStation;

    public Departure(String departedTime, String expectedArrivalTime, Train train, Station fromStation, Station toStation) {
        this.departedTime = LocalDateTime.parse(departedTime, GlobalInfo.getDtf());
        this.expectedArrivalTime = LocalDateTime.parse(expectedArrivalTime, GlobalInfo.getDtf());
        this.train = train;
        this.fromStation = fromStation;
        this.toStation = toStation;
    }

    public LocalDateTime getDepartedTime() {
        return this.departedTime;
    }

    public Station getToStation() {
        return toStation;
    }

    public Station getFromStation() {
        return fromStation;
    }

    public LocalDateTime getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    public Train getTrain() {
        return train;
    }
}
