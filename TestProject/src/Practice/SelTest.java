package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\softwaresforselenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
