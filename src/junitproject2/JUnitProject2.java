package junitproject2;

import java.util.ArrayList;
import java.util.List;

public class JUnitProject2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Client client = new Student();
        List<Client> clients = new ArrayList<>();
        clients.add(new Firm(2, "Nv Realdolmen"));
        clients.add(client);
        for (Client c : clients) {
            System.out.println(c.createClientCard());
        }

    }

}
