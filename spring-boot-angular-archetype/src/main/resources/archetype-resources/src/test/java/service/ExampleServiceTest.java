package ${package}.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ExampleServiceTest {

    private final String TEST_RESPONSE = "Hello to Spring Boot w/ Angular!!!";

    private ExampleService darkService;

    @BeforeEach
    public void setUp() {
        darkService = new ExampleService();
    }

    @Test
    public void sayDarkHello() {
        assertEquals(TEST_RESPONSE, darkService.sayHello());
    }

}