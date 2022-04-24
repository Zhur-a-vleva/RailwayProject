import java.util.ArrayList;
import java.util.List;

public class Server {
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void updateDeparture(Departure departure) {
        Station to = departure.getToStation();
        ArrayList<Departure> oldDepartures = to.getDepartures();
        for (int i = 0; i < oldDepartures.size(); ++i) {
            if (oldDepartures.get(i).getTrain().equals(departure.getTrain())) {
                oldDepartures.set(i, departure);
            }
        }
        if (subscribers.contains(to.getAdmin())) {
            to.getAdmin().updateInfo();
        }
    }
}
