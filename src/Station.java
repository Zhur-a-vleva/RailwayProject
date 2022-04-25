import java.util.ArrayList;

/**
 * Class Station represents station with its admin and timetables(displays). Admin is the only one single person, but there can be more than one
 * timetable. Also it has list of departures, that can be updated.
 */
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

    public void updateTimeTables() {                //updates info on timetables
        for (TimeTable timeTable : timeTables) {
            timeTable.printSchedule(departures);
        }
    }

    public ArrayList<Departure> getDepartures() {
        return departures;
    } //returns list of departures

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
