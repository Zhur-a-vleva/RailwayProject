public class Admin implements Subscriber {

    private final Station station;

    public Admin(Station station) {
        this.station = station;
    }

    public Station getStation() {
        return station;
    }

    public void uploadChanges() {
        //TODO(upload changes to server)
    }

    @Override
    public void updateInfo() {

        //TODO(download changes from server)
    }
}
