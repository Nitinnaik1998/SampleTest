package Pac1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createcontactTest() {
		String URL=System.getProperty("url");
		String browser=System.getProperty("browser");
		String username=System.getProperty("username");
		String password=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);
		System.out.println("executed create conatct test");
		
	}
	
	@Test
	public void modifycontactTest() {
		System.out.println("executed modify contact test");
		
	}

}
