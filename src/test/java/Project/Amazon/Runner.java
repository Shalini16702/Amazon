package Project.Amazon;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runner {

	@Test
	public void browserlaunch() {
		System.out.println("Program started");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start maximized");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		System.out.println("Browser Launched");

	}
		
		
}
