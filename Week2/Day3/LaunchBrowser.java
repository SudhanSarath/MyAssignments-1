package Week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement emailAddress = driver.findElement(By.id("email"));
		emailAddress.sendKeys("m.sarathkumar289@gmial.com");
		driver.findElement(By.name("pass")).sendKeys("Sudhan@123");
		driver.findElement(By.name("login")).click();
       
		Thread.sleep(2000);	
		
		//driver.close();
		
	}

}
