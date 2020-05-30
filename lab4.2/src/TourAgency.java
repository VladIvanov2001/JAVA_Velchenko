import java.util.Map;
import java.util.HashMap;

public class TourAgency{

    public static Client defineClient(String clientName){
        Map<String,Client> clients=new HashMap<>();

        clients.put("tom",new Client("Tom",20));
        clients.put("nik",new Client("Nik",35));
        clients.put("ann",new Client("Ann",27));
        clients.put("jon",new Client("Jon",24));
        clients.put("mary",new Client("Mary",25));

        return clients.get(clientName);
    }

    public static Tour defineTour(String tourType){

        Map<String,Tour> tours=new HashMap<>();

        tours.put("excursions",new Excursions(250,"bus",false,2));
        tours.put("therapy",new Therapy(300,"airplane",true,10));
        tours.put("shopping",new Shopping(200,"bus",false,2));

        return tours.get(tourType);

    }

}
