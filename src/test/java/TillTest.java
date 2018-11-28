import Dealership.Till;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    Till till;

    @Before
    public void before(){
        till = new Till(123.01);
    }

    @Test
    public void hasCashInTill(){
        assertEquals(123.01, till.getBalance(), 0.01);
    }

}
