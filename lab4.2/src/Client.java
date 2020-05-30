import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Client implements Serializable {
    private String clientName;
    private int clientAge;

    public Client(String clientName, int clientAge) {
        this.clientName = clientName;
        this.clientAge = clientAge;
    }

    public void setClientName(String clientName){
        this.clientName=clientName;
    }

    public String getClientName(){
        return clientName;
    }

    public void setClientAge(int clientAge){
        this.clientAge=clientAge;
    }

    public int getClientAge() throws ClientException{
        if(clientAge < 0) throw new ClientException("Возраст человека не может быть меньше 0",clientAge);
        return clientAge;
    }

    public static Client getInfo(){
        Client client = null;
        try {
            Statement statement = Connector.getMyConnection().createStatement();
            String sql = "select AGE, FIRST_NAME from tourist";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int age = resultSet.getInt(1);
                String name = resultSet.getString(2);
                client = new Client(name, age);
            }
            if(Connector.getMyConnection() != null){
                Connector.getMyConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }

    @Override
    public String toString() {
        return "\nname " + clientName + "\nage " + clientAge;
    }
}
