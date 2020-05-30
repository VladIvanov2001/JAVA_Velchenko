import java.util.List;

public class ClientVouchers {

    private List<Client> clients;
    private List<Tour> tours;

    public ClientVouchers(List<Client> clients, List<Tour> tours) {
        this.clients = clients;
        this.tours = tours;
    }

    public List<Client> getClient() {
        return clients;
    }

    public void setClient(List<Client> clients) {
        this.clients = clients;
    }

    public List<Tour> getTour() {
        return tours;
    }

    public void setTour(List<Tour> tours) {
        this.tours = tours;
    }
}
