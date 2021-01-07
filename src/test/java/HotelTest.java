import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;

    @Before
    public void setUp(){
        hotel = new Hotel("CodeClan Towers");
    }

    @Test
    public void hotelHasName(){
        assertEquals("CodeClan Towers", hotel.getName());
    }

}
