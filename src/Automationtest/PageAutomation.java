package Automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/choud/prerna-workspace/prernahelloworld/lib/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.weightwatchers.com/us/"); // open the URL 
		if(driver.getTitle().equalsIgnoreCase("WW (Weight Watchers): Weight Loss & Wellness Help")) {
			
			System.out.println("Page title is verfified");//Page title is verified 
		}
		driver.findElement(By.xpath("//*[@id='ela-menu-visitor-desktop-supplementa_find-a-studio']/span")).click(); //clicked on Find a Studio
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("meetingSearch")).sendKeys("10011");
		driver.findElement(By.xpath("//button[@type = 'button']")).click();
		System.out.println(driver.findElement(By.className("location__name")).getText());
		driver.findElement(By.className("location__name")).click();
		System.out.println("Operating Hours for this location is: " + driver.findElement(By.xpath("//*[@id='content']/div/div/ui-view/ui-view/div[1]/div[2]/div/div/div[2]/div[1]/hours-list/ul")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
