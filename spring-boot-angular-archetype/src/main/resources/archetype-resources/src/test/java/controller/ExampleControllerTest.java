
package ${package}.controller;

import ${package}.service.ExampleService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleControllerTest {

    private final String TEST_RESPONSE = "Hello to Spring Boot w/ Angular!!!";

    @InjectMocks
    private ExampleController exampleController;

    @Mock
    private ExampleService darkService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void sayDarkHello() {

        Mockito.when(darkService.sayHello()).thenReturn(TEST_RESPONSE);

        String actualResponse = exampleController.sayHello();

        assertEquals(TEST_RESPONSE, actualResponse);
    }

}