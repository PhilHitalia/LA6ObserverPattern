import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Subscribers phil = new Subscribers();
        phil.setSubscriberName("Phil");
        
        Subscribers oliver = new Subscribers();
        oliver.setSubscriberName("Oliver");
        
        Subscribers jerry = new Subscribers();
        jerry.setSubscriberName("Jerry");

        List<Subscribers> activeSubscriberss = new ArrayList<>();
        activeSubscriberss.add(phil);
        activeSubscriberss.add(oliver);
        activeSubscriberss.add(jerry);

    
        NewsAgency agency = new NewsAgency();
        agency.setHeadline("T1 Wins League of Legends World Championship");
        agency.setnewscontent("Faker and the legendary T1 roster secure another \nhistoric victory in the grand finals, breaking global viewership records.");
        
        agency.setSubscriberList(activeSubscriberss);

        System.out.println(">>> BREAKING NEWS! <<<");
        System.out.println(agency.notifySubscribers());


        agency.removeSubscriber(jerry);


        agency.setHeadline("Smartphones Now Feature Built-in Holograms");
        agency.setnewscontent("The latest software update allows users to project \nsimple 3D images directly from their phone screens.");


        System.out.println(">>> NEWS UPDATE! <<<");
        System.out.println(agency.notifySubscribers());
    }
}