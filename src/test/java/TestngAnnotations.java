import org.testng.annotations.*;

public class TestngAnnotations {
    @BeforeSuite
    public void printSuit(){
        System.out.println("From Before Suit");
    }

    @BeforeTest
    public void printTest(){
        System.out.println("From Before Test");
    }

    @BeforeClass
    public void printClass(){
        System.out.println("From Before Class");
    }

    @BeforeMethod
    public void printMethod(){
        System.out.println("From Before Method");
    }

    @Test
    public void printTestFromTest(){
        System.out.println("I am the FIRST TEST");
    }

    @Test
    public void printTestFromSecTest(){
        System.out.println("I am the SECOND TEST");
    }

    @AfterMethod
    public void printAfterMethod(){
        System.out.println("From After Method");
    }

    @AfterClass
    public void printAfterClass(){
        System.out.println("From After Class");
    }

    @AfterTest
    public void printAfterTest(){
        System.out.println("From After Test");
    }

    @AfterSuite
    public void printAfterSuit(){
        System.out.println("From After Suit");
    }
}
