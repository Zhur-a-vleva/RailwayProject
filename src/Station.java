import java.util.ArrayList;

public class Station {
    private String name;
    private Admin admin;
    private final ArrayList<TimeTable> timeTables;
    private final ArrayList<Departure> departures;

    public Station(String name){
        this.name = name;
        this.admin = new Admin(this);
        timeTables = new ArrayList<>();
        departures = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void updateTimeTables() {
        for (TimeTable timeTable : timeTables) {
            timeTable.printSchedule(departures);
        }
    }

    public ArrayList<Departure> getDepartures() {
        return departures;
    }

    public void addDeparture(Departure departure) {
        departures.add(departure);
    }

    public void setName(String newName){
        this.name = newName;
    }

    public Admin getAdmin(){
        return this.admin;
    }

    public void setAdmin(Admin newAdmin){
        this.admin = newAdmin;
    }

    public void addTimeTable(TimeTable t){
        this.timeTables.add(t);
    }

    public void removeTimeTable(TimeTable t){
        this.timeTables.remove(t);
    }
}
