import java.util.List;

public class Server {
    private List<Station> stations;
    private List<Subscriber> subscribers;

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void updateDeparture(Departure departure) {
        
    }
}
