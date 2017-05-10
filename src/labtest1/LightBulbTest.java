package labtest1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LightBulbTest {

	LightBulb bulb;
	
	@Before
	public void setUp() throws Exception {
		
		bulb = new LightBulb(1000);
	}

	 

	@Test
	public void testGetBulbWattage() {
		
		assertEquals(1000,bulb.getBulbWattage());
	}

}
