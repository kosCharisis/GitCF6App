package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.UserCredentials;
import gr.aueb.cf.ch12.model.UserUser;

public class MainUserCredentials {

    public static void main(String[] args) {
        UserUser acostas = new UserUser(1, "Costas", "C.");
        UserUser aanna = new UserUser(2, "Anna", "G.");
        UserCredentials bcostas = new UserCredentials(1, "acostas", "123456789");
        UserCredentials banna = new UserCredentials(2, "banna", "98765431");

        System.out.println("Costa's id: " + acostas.getId());
        System.out.println("Firstname: " + acostas.getFirstname());
        System.out.println("Lastname: " + acostas.getLastname());
        System.out.println("Username: " + bcostas.getUsername());
        System.out.println("Password: " + bcostas.getPassword());

        System.out.printf("Anna's id: %d, Firstname: %s, Lastname: %s, Username: %s, Password: %s",
                aanna.getId(), aanna.getFirstname(), aanna.getLastname(), banna.getUsername(), banna.getPassword());
    }
}
