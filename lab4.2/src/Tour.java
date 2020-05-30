import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Tour {
    public String type;
    private String transport;
    private boolean food;
    private int numberOfDays;
    private int cost;

    public Tour(int cost,String transport,boolean food,int numberOfDays) {
        this.cost = cost;
        this.transport=transport;
        this.food=food;
        this.numberOfDays=numberOfDays;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean getFood(){
        return food;
    }

    public String getTransport(){
        return transport;
    }
    public void setTransport(String transport) {
        this.transport=transport;
    }
    public String getType(){
        return type;
    }
    public void setType(String type) {
        this.type=type;
    }

    public int getNumberOfDays(){
        return numberOfDays;
    }

    public void setFood(boolean food){
        this.food=food;
    }
    public void setNumberOfDays(int numberOfDays){
        this.numberOfDays=numberOfDays;
    }

    public static Tour getInfo(){
        Tour tour = null;
        try {
            Statement statement = Connector.getMyConnection().createStatement();
            String sql = "select TYPE_OF_TOUR, COST from tourist";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int cost = resultSet.getInt(1);
                boolean food = resultSet.getBoolean(2);
                int days = resultSet.getInt(3);
                String transport = resultSet.getString(4);
                tour = new Tour(cost,transport,food,days);
            }
            if(Connector.getMyConnection() != null){
                Connector.getMyConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tour;
    }
    @Override
    public String toString() {
        return " |Transport: "+transport+" |Food : "+food+" |Number of days: "+numberOfDays+" |Cost: " + cost + ".";
    }
}

