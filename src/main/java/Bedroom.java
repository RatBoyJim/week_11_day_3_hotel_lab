import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private RoomType room;

    public Bedroom(int roomNumber, int capacity, RoomType room){
        this.roomNumber = roomNumber;
        this.capacity= capacity;
        this.room = room;
        this.guests = new ArrayList<>();
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int guestCount(){
        return this.guests.size();
    }

    public RoomType getRoomType(){
        return this.room;
    }

    public void addGuestToGuests(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuest(){
        this.guests.remove(0);
    }



}
