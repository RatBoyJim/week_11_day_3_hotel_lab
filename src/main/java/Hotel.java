import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public String getName(){
        return this.name;
    }

    public int getNumberOfBedrooms(){
        return this.bedrooms.size();
    }

    public int getNumberOfConferenceRooms(){
        return this.conferenceRooms.size();
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public void addGuestToBedroom(Bedroom bedroom, Guest guest){
        bedroom.addGuestToGuests(guest);
    }

    public void addGuestToConferenceRoom(ConferenceRoom conferenceRoom, Guest guest){
        conferenceRoom.addGuestToGuestList(guest);
    }

    public void removeGuestFromRoom(ConferenceRoom conferenceRoom){
        conferenceRoom.removeGuestFromGuestList();

    }

    public void removeGuestFromBedroom(Bedroom bedroom){
        bedroom.removeGuest();
    }

}
