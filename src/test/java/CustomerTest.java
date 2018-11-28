import Dealership.People.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void setup() {
        customer = new Customer("Alex", 10_000.50);
    }

    @Test
    public void hasName() {
        assertEquals("Alex", customer.getName());
    }

    @Test
    public void hasWallet() {
        assertEquals(10_000.50, customer.getWallet(), 0.001);
    }

}
