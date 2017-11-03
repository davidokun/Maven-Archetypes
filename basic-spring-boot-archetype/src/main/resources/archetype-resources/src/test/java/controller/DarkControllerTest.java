package ${package}.controller;

import com.lightsideofthedev.service.DarkService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class DarkControllerTest {

    private final String TEST_RESPONSE = "Hello World!!!";

    @InjectMocks
    private DarkController darkController;

    @Mock
    private DarkService darkService;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void sayDarkHello() throws Exception {

        Mockito.when(darkService.sayHelloDark()).thenReturn(TEST_RESPONSE);

        String actualResponse = darkController.sayDarkHello();

        assertEquals(TEST_RESPONSE, actualResponse);
    }

}