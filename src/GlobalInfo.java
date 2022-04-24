import java.time.format.DateTimeFormatter;

public class GlobalInfo {

    // global variables

    private static final Server server = new Server();
    private static final String ADMIN_LOGIN = "gefkmld&vedfn#";
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public static DateTimeFormatter getDtf() {
        return dtf;
    }

    public static Server getServer() {
        return server;
    }

    public static String getAdminLogin() {
        return ADMIN_LOGIN;
    }

    // Use-cases of the system
    public static void main(String[] args) {
        Station sUfa = new Station("Ufa");
        Station sKazan = new Station("Kazan");
        Station sMoscow = new Station("Moscow");

        sKazan.addDeparture(new Departure("24-04-2022 19:36:00", "25-04-2022 02:36:00",
                new Train("Ufa-Kazan"), sUfa, sKazan));
        sMoscow.addDeparture(new Departure("25-04-2022 02:50:00", "25-04-2022 04:50:00",
                new Train("Ufa-Kazan"), sKazan, sMoscow));
        sUfa.addDeparture(new Departure("25-04-2022 04:50:00", "25-04-2022 08:50:00",
                new Train("Ufa-Kazan"), sMoscow, sUfa));

        sUfa.addTimeTable(new TimeTable("Way 1"));
        sUfa.addTimeTable(new TimeTable("Way 2"));
        sUfa.addTimeTable(new TimeTable("Way 3"));

        sKazan.addTimeTable(new TimeTable("Way 1"));
        sKazan.addTimeTable(new TimeTable("Way 2"));

        sMoscow.addTimeTable(new TimeTable("Way 1"));
        sMoscow.addTimeTable(new TimeTable("Way 2"));
        sMoscow.addTimeTable(new TimeTable("Way 3"));
        sMoscow.addTimeTable(new TimeTable("Way 4"));

        server.subscribe(sUfa.getAdmin());
        server.subscribe(sKazan.getAdmin());
        server.subscribe(sMoscow.getAdmin());

        // Delay train from Ufa to Kazan
        Admin adminUfa = sUfa.getAdmin();
        adminUfa.uploadChanges(new Departure("24-04-2022 19:56:00", "25-04-2022 02:56:00",
                new Train("Ufa-Kazan"), sUfa, sKazan));

    }
}
