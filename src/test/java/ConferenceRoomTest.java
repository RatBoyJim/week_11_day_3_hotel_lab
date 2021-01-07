import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {


    private ConferenceRoom conferenceRoom;

    @Before
    public void setUp(){
        conferenceRoom = new ConferenceRoom("Conference Room A", 50);
    }

    @Test
    public void conferenceRoomHasName() {
        assertEquals("Conference Room A", conferenceRoom.getName());

    }

    @Test
    public void conferenceRoomHasCapacity() {
        assertEquals(50, conferenceRoom.getCapacity());
    }

    @Test
    public void guestListStartsEmpty() {
        assertEquals(0, conferenceRoom.getGuestList());
    }

}
