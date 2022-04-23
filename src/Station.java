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
}
