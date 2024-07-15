package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void initialization(String browsername) {
		
		if(browsername.equalsIgnoreCase("Chrome")) {
			
			 driver=new ChromeDriver();
			 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)).pageLoadTimeout(Duration.ofSeconds(30));
			 
			 driver.manage().window().maximize();
			 
			 driver.manage().deleteAllCookies();
			 
			 driver.get("https://ui.cogmento.com/");
		}
	}

}
