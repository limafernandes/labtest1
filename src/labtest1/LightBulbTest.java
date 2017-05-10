package labtest1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LightBulbTest {

	LightBulb bulb;
	
	@Before
	public void setUp() throws Exception {
		
		bulb = new LightBulb(400);
	}

	 

	@Test
	public void testGetBulbWattage() {
		
		assertEquals(400,bulb.getBulbWattage());
	}

}
