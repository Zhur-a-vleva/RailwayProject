import java.util.ArrayList;
import java.util.HashMap;

public class Train {
    private String name;

    public Train(String s){
        this.name = s;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
}
