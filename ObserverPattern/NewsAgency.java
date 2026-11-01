import java.util.List;

public class NewsAgency implements NewsSubject {
    private String headline;
    private String newscontent;
    private List<Subscribers> SubscriberList;

    @Override
    public void addSubscriber(Subscribers Subscriber) {
        this.SubscriberList.add(Subscriber);
    }

    @Override
    public void removeSubscriber(Subscribers Subscriber) {
        this.SubscriberList.remove(Subscriber);
    }

    @Override
    public String notifySubscribers() {
        StringBuilder output = new StringBuilder();
        for (Subscribers Subscriber : SubscriberList) {
            output.append("Greetings, ").append(Subscriber.getSubscriberName()).append("!\n");
            output.append("ALERT: ").append(headline).append(" - ").append(newscontent).append("\n\n");
        }
        return output.toString();
    }

    public String getHeadline() { 
        return headline; 
    }
    
    public void setHeadline(String headline) { 
        this.headline = headline; 
    }
    
    public String getnewscontent() { 
        return newscontent; 
    }
    
    public void setnewscontent(String newscontent) { 
        this.newscontent = newscontent; 
    }

    public List<Subscribers> getSubscriberList() { 
        return SubscriberList; 
    }
    
    public void setSubscriberList(List<Subscribers> SubscriberList) { 
        this.SubscriberList = SubscriberList; 
    }
}