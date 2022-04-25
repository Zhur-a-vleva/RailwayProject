import java.util.ArrayList;
import java.util.List;

/**
 * Class Server contains list of subscribers, which it has to notify in case of updating departure time. It has 2 methods:
 * 1) subscribe() or unsubscribe() and or removes new Object that implements Interface Subscriber
 * 2) updateDeparture(Departure departure) - if admin is in the list of subscribers, then it notifies this admin and
 * updates information on timetables
 */
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
        for (int i = 0; i < oldDepartures.size(); ++i) {        //finds the departure of the same train in the list and replaces it with new
            if (oldDepartures.get(i).getTrain().equals(departure.getTrain())) {
                oldDepartures.set(i, departure);
            }
        }
        if (subscribers.contains(to.getAdmin())) {           //if admin is in the list of subscribers, then it updates information
            to.getAdmin().updateInfo();
        }
    }
}
