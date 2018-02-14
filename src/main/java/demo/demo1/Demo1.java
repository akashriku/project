package demo.demo1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void test1() {
		
         String url="https://www.makemytrip.com/flights/";
		
		 //to set property for the respective browse
         System.setProperty("webdriver.chrome.driver","C:\\Users\\akash.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     System.out.println("i am testng test");
         WebDriver driver=new ChromeDriver();
		 driver.get(url);
		 

	}

}
