import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void setUp(){
        bedroom = new Bedroom(100, 2, RoomType.DOUBLE);
        guest = new Guest("Tom Nook");
    }

    @Test
    public void bedroomHasNumber(){
        assertEquals(100, bedroom.getRoomNumber());
    }

    @Test
    public void bedroomHasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void bedroomHasRate(){
        assertEquals(80, bedroom.getValueFromEnum());
    }

    @Test
    public void bedroomGuestsStartsEmpty(){
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void bedroomHasType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void canAddGuestToGuests(){
        bedroom.addGuestToGuests(guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canRemoveGuestFromGuests(){
        bedroom.addGuestToGuests(guest);
        bedroom.removeGuest();
        assertEquals(0, bedroom.guestCount());

    }
}
