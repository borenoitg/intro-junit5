package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    static void afterClass() {
        System.out.println("Before All - I am called Once!!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each....");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorldOne() {
        System.out.println(greeting.helloWorld("John"));
    }

    @Test
    void testHelloWorldTwo() {
        System.out.println(greeting.helloWorld("Sam"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each....");
    }

    @AfterAll
    static void AfterClass() {
        System.out.println("After All - I am called Once!!!");
    }
}