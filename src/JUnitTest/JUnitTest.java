package JUnitTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class JUnitTest {
    @BeforeAll
    public void beforeTest(){
        System.out.println("Running before Test");
    }
    @Test
    public void test_add1(){
     Addition add = new Addition();
     assertEquals(10, add.add(5,5));
     assertNotEquals(50, add.add(45,4));
     System.out.println("Running Addition Test");
    }
    @Test
    public void test_add2(){
        Addition add = new Addition();
        assertEquals(-10, add.add(-5,-5));
        assertEquals(50, add.add(45,5));
        System.out.println("Running Addition Test");
    }


    @AfterAll
    public void afterTest(){
        System.out.println("Running after Test");
    }
}
