import java.util.Scanner;

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
            GlobalInfo.getServer().updateDeparture(newDeparture);
        }
    }

    @Override
    public void updateInfo() {
        station.updateTimeTables();
    }

    public boolean checkLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input login");
        String login = scanner.nextLine();
        return login.equals(GlobalInfo.getAdminLogin());
    }
}
