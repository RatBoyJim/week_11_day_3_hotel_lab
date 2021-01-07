import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void setUp(){
        bedroom = new Bedroom(100, 1, RoomType.SINGLE);
        booking = new Booking(bedroom, 3);
    }

    @Test
    public void bookingHasBedroom(){
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void bookingHasNights(){
        assertEquals(3, booking.getNights());
    }
}
