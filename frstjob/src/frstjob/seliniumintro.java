package frstjob;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seliniumintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("WebDriver.Chrome.ChromeDriver","/Users/susmithaginjupalli/Documents/chromedriver");
		//@SuppressWarnings("unused")
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
	
		


	}

}
