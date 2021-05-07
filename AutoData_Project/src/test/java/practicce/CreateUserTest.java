package practicce;

import org.testng.annotations.Test;

public class CreateUserTest {
@Test
public void createUserTest()
{
	String USERNAME = System.getProperty("username");
	String PASSWORD = System.getProperty("password");
	String BROWSER = System.getProperty("browser");
	System.out.println("execute Test1");
	System.out.println("=======>"+USERNAME);
	System.out.println("=======>"+PASSWORD);
	System.out.println("=======>"+BROWSER);
}
}
