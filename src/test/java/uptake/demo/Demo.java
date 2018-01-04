package uptake.demo;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	WebDriver d;
	@BeforeMethod

	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prashanth\\workspace_bckup\\demo\\src\\main\\java\\uptake\\demo\\resources\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

	}

	@Test

	public void homePageValidation() throws InterruptedException
	{

		try {

			d.get("https://www.uptake.com");

			String t1 = d.getTitle();
			String t2 = "Industrial Analytics for Global Industry | Uptake";

			if(t1.equals(t2))
			{
				System.out.println("Title of the Home Page is correct");			
			}
			ReusableMethods.clickIfElementXPATHPresent(d, PageObjects.XPATH_ABOUT);
			ReusableMethods.clickIfElementLinkTextPresent(d, PageObjects.LINKTEXT_POLICY);
			ReusableMethods.getTextElementClassPresent(d, PageObjects.class_text);
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@AfterMethod

	public void tearDown()
	{
		d.quit();
	}
	
}