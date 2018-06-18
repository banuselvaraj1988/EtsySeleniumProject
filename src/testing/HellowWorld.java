package testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HellowWorld {
	  public static void main(String[] args) { 

		  WebDriver wDriver;
		  System.setProperty("webdriver.ie.driver","C:\\Users\\chand\\Documents\\Encore\\Apps\\Selenium\\" + "IEDriverServer.exe");
			DesiredCapabilities capab = DesiredCapabilities.internetExplorer();
	        capab.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	        InternetExplorerOptions options = new InternetExplorerOptions();
	        wDriver = new InternetExplorerDriver(options);
	        wDriver.manage().window().maximize();
	        wDriver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	        
	        wDriver.get("https://www.etsy.com/");
	        
	        JavascriptExecutor executor = (JavascriptExecutor)wDriver;
	        executor.executeScript("document.getElementById('search-query').value = 'sports shoes';");
	        
	        WebElement search = wDriver.findElement(By.xpath("/html/body/div[3]/header/div/div[2]/div/form/div/div[2]/button"));
	        executor.executeScript("arguments[0].click();", search);

	        WebElement sortbutton = wDriver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div/div/button"));
	        executor.executeScript("arguments[0].click();", sortbutton);
	        
	        WebElement sortbyprice = wDriver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div/ul/li[3]/a"));
	        executor.executeScript("arguments[0].click();", sortbyprice);
	    
	  }
	}