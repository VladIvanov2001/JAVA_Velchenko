import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ClientException, IOException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        String file = "demo.data";
        Serializator sz = new Serializator();
        Client client1 = null;
        client1 = Client.getInfo();
        Client finalClient = client1;
        new Thread(){
            public void run(){
                synchronized (file){
                    boolean b = sz.serialization(finalClient, file);
                }
            }
        }.start();
        new Thread(){
            public void run(){
                synchronized (file){
                    Client res = null;
                    try {
                        res = sz.deserialization(file);
                    } catch (InvalidObjectException e) {
                        // обработка
                        e.printStackTrace();
                    }
                    System.out.println(res);
                }
            }
        }.start();
        System.out.println(client1.toString());


       /* Client client2 = new Client("Bella", 25);
        TourAgency client = new TourAgency();
        System.out.println(TourAgency.defineClient("tom").getClientName());
        System.out.println(TourAgency.defineTour("excursions").getCost());
        TourBooking tour = new TourBooking();*/
    }
}
