import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;

    @Before
    public void setUp(){
        hotel = new Hotel("CodeClan Towers");
        bedroom = new Bedroom(100, 2, RoomType.DOUBLE);
        conferenceRoom = new ConferenceRoom("Conference Room A", 50);
    }

    @Test
    public void hotelHasName(){
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void hotelHasEmptyBedroomsList(){
        assertEquals(0, hotel.getNumberOfBedrooms());
    }

    @Test
    public void hotelHasEmptyConferenceRoomsList(){
        assertEquals(0, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canAddBedroomToBedroomsList(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canAddConferenceRoomToList(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }


}
