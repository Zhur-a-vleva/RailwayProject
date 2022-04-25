import java.util.Scanner;

/**
 * Class admin represents the person, who works on station and sends information about departure of trains from this station to server. But before sending he has to
 * insert his login(it is in GlobalInfo. Also, he has two methods:
 * 1) uploadChanges(Departure newDeparture) - uploads new information about the departure of train to server.
 * 2) updateInfo() - uploads information on timetables of his station.
 */
public class Admin implements Subscriber {
    private final Station station;

    public Admin(Station station) {
        this.station = station;
    }

    public Station getStation() {
        return station;
    }

    public void uploadChanges(Departure newDeparture) {
        if (checkLogin()) {
            GlobalInfo.getServer().updateDeparture(newDeparture);        //here he uploads information to server
        }
    }

    @Override
    public void updateInfo() {
        station.updateTimeTables();
    }

    public boolean checkLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input login");
        String login = scanner.nextLine();                             //checking login for access
        return login.equals(GlobalInfo.getAdminLogin());
    }
}