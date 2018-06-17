package m1;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestHello {
	
	String url="https://www.facebook.com";

	
	@Test
	public void demo1() {
		System.out.println("hello i am in demo 1");

		System.out.println(System.getProperty("url"));
		System.out.println(url);
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("environment"));
		Assert.assertTrue(true);
		System.out.println("hello i am in demo 1");
		
		
	}

}
