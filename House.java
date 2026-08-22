class House {
    String location;
    int rooms;

    void display() {
        System.out.println("Location: " + location);
        System.out.println("Number of Rooms: " + rooms);
    }
}

public class Main {
    public static void main(String[] args) {
        House h = new House();

        h.location = "Chennai";
        h.rooms = 3;

        h.display();
    }
}
