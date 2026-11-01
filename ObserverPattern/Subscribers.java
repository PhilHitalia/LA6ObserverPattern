public class Subscribers implements SubscriberObserver {
    private String SubscriberName;

    public String getSubscriberName() {
        return SubscriberName;
    }

    public void setSubscriberName(String SubscriberName) {
        this.SubscriberName = SubscriberName;
    }

    @Override
    public void NewsUpdate(NewsAgency newsAgency) {

    }
}