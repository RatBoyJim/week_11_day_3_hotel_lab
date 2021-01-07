import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guestList;

    public ConferenceRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.guestList = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getGuestList() {
        return this.guestList.size();
    }

    public void addGuestToGuestList(Guest guest) {
        this.guestList.add(guest);
    }


    public void removeGuestFromGuestList() {
        this.guestList.remove(0);
    }
}
