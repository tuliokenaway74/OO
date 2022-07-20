package compiladores;

import org.example.Hostel;
import org.example.Room;

public class RoomController {
    private Room room;
    private Hostel hostel;

    public RoomController() {
        this.hostel = new Hostel();
    }

    public void cadastrarQuarto(int number, String type){
        room = new Room(number, type);
    }

    public String salvarDados(String name, int floor, String description, double dimension){
        room.setName(name);
        room.setFloor(floor);
        room.setDescription(description);
        room.setDimension(dimension);
        hostel.addRoom(room);
        return "Room data created suscessfully!";
    }

    public static void main(String[] args) {
        RoomController roomController = new RoomController();
        roomController.cadastrarQuarto(312, "Double room");
        String resultado = roomController.salvarDados("D. Leopoldina", 3, "", 20);
        System.out.println(resultado);
    }
}
