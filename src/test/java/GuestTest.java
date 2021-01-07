import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {


        private Guest guest;

        @Before
        public void setUp(){
            guest = new Guest("Tom Nook");
        }

        @Test
        public void guestHasName() {
            assertEquals("Tom Nook", guest.getName());

        }

}
