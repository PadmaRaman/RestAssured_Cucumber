package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseTests {

    @Before("@ProductsGet")
    public void ProductsGet()
    {
        System.out.println("**********************");
        System.out.println("This line is from Get Product hook");
    }

    @Before("@ProductsPost")
    public void ProductsPost()
    {
        System.out.println("**********************");
        System.out.println("This line is from Post Product hook");
    }

    @After
    public void teardown()
    {
        System.out.println("This is to Test clean");
    }

}
