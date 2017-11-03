package ${package}.service;

import com.lightsideofthedev.service.DarkService;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class DarkServiceTest {

	private final String TEST_RESPONSE = "Hello Dark World!!!";

	private DarkService darkService;

	@Before
	public void setUp(){
		darkService = new DarkService();
	}

    @Test
    public void sayDarkHello() throws Exception {

    	assertEquals(TEST_RESPONSE, darkService.sayHelloDark());

    }

}