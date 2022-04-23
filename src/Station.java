import java.util.ArrayList;

public class Station {
    private String name;
    private Admin admin;
    private ArrayList<TimeTable> timeTables;

    public String getName(){
        return this.name;
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
