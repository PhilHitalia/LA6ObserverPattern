public interface NewsSubject {
    void addSubscriber(Subscribers Subscriber);
    void removeSubscriber(Subscribers Subscriber);
    String notifySubscribers();
}