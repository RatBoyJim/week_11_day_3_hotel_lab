import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;
    private Guest guest;
    private Booking booking;

    @Before
    public void setUp(){
        hotel = new Hotel("CodeClan Towers");
        bedroom = new Bedroom(100, 2, RoomType.DOUBLE);
        conferenceRoom = new ConferenceRoom("Conference Room A", 50);
        guest = new Guest("Tom Nook");

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

    @Test
    public void canCheckInGuestToBedroom(){
        hotel.addBedroom(bedroom);
        hotel.addGuestToBedroom(bedroom, guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canCheckInGuestToConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        hotel.addGuestToConferenceRoom(conferenceRoom, guest);
        assertEquals(1, conferenceRoom.getGuestList());
    }

    @Test
    public void canCheckOutGuestFromBedroom(){
        hotel.addBedroom(bedroom);
        hotel.addGuestToBedroom(bedroom, guest);
        hotel.removeGuestFromBedroom(bedroom);
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void canCheckOutGuestFromRoom(){
            hotel.addConferenceRoom(conferenceRoom);
            hotel.addGuestToConferenceRoom(conferenceRoom, guest);
            hotel.removeGuestFromRoom(conferenceRoom);
            assertEquals(0, conferenceRoom.getGuestList());
    }

    @Test
    public void canCreateBooking(){
        booking = hotel.bookRoom(bedroom, 2);
        assertEquals(2, booking.getNights());
    }

    @Test
    public void canCreateBillForBooking(){
        booking = hotel.bookRoom(bedroom, 2);
        assertEquals(160, hotel.createBill(booking));
    }




}
