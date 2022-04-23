import java.io.PrintStream;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class GlobalInfo {

    // global variables

    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private static final Server server = new Server();
    private static final String ADMIN_LOGIN = "gefkmld&vedfn#";
    private static ArrayList<Station> stations = new ArrayList<>();
    private static ArrayList<Train> trains = new ArrayList<>();

    public static Server getServer() {
        return server;
    }

    public static String getAdminLogin() {
        return ADMIN_LOGIN;
    }

    // Use-cases of the system
    public static void main(String[] args) {
        
    }
}
