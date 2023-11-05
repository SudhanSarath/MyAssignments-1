package Week2.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/"); 
		
		WebElement emailAddress = driver.findElement(By.id("email"));
		emailAddress.sendKeys("testleaf.2023@gmial.com");
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		String title = driver.getTitle();
        //System.out.println(title);
        if(title.contains("Facebook")) {
        	System.out.println("The title is correct " + title);
        }else
        {
        	System.out.println("The title is not correct " + title);
        }
		
		
		
	}

}
