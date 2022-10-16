import java.util.Date;

public class Client {

    private String nameClient;
    private String emailClient;
    private Date birthDateClient;

    public Client() {
    }
    public Client(String nameCliente, String emailCliente, Date birthDateCliente) {
        this.nameClient = nameCliente;
        this.emailClient = emailCliente;
        this.birthDateClient = birthDateCliente;
    }
    public String getNameClient() {

        return nameClient;
    }
    public String getEmailClient() {

        return emailClient;
    }
    public Date getBirthDateClient() {
        return birthDateClient;
    }
}
