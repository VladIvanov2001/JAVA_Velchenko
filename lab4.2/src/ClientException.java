public class ClientException extends Exception {
    private int clientAge;
    public int getClientAge(){
        return clientAge;
    }
    public ClientException(String message, int age){
        super(message);
        clientAge = age;
    }
}
