package compiladores;

import org.example.Adress;
import org.example.Guest;
import org.example.Hostel;

public class GuestController {
    private Guest guest;
    private Hostel hostel;

    public GuestController() {
        this.hostel = new Hostel();
    }

    public void cadastrarGuest(String name, String lastname){
        guest = new Guest(name, lastname);
    }

    public String salvarGuest(Adress adress, String title){
        guest.setAdress(adress);
        guest.setTitle(title);
        hostel.addGuest(guest);
        return "Guest data created suscessfully!";
    }

    public static void main(String[] args) {
        GuestController guestController = new GuestController();
        Adress adress = new Adress("São Petesburgo", "Northwestern Federal District of Russia", "Russia", "191185", "15, Malaya Morskaya Ulitsa");
        guestController.cadastrarGuest("Anna", "Karenina");
        String resultado = guestController.salvarGuest(adress, "Mrs.");
        System.out.println(resultado);
    }
}
