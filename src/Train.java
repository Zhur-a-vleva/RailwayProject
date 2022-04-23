import java.util.ArrayList;
import java.util.HashMap;

public class Train {
    private String name;
    private ArrayList<Station> route;
    private HashMap<Station, Integer> indexInRoute;

    public Train(String s){
        this.name = s;
        this.route = new ArrayList<>();
        this.indexInRoute = new HashMap<>();
    }

    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void addStation(Station s){
        indexInRoute.put(s, route.size());
        route.add(s);
    }
}
