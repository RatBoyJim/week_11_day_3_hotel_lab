import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;

    @Before
    public void setUp(){
        bedroom = new Bedroom(100, 2, RoomType.DOUBLE);
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
    public void bedroomGuestsStartsEmpty(){
        assertEquals(0, bedroom.guestCount());
    }
}
