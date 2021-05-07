package practicce;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class CreateCustomerTest {
	
	@Test
	public void createCustomerTest(XmlTest xml)
	{
		System.out.println("execute Test1");
		String BEROWSER=xml.getParameter("browser");
		System.out.println(BEROWSER);
	}
	

}
