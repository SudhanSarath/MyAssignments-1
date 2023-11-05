package Week2.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	     driver.findElement(By.linkText("Create new account")).click();
	     
	     driver.findElement(By.name("firstname")).sendKeys("Sarath");
	     
	     driver.findElement(By.name("lastname")).sendKeys("Kumar");
	     
         driver.findElement(By.name("reg_email__")).sendKeys("9043205656");
         
         driver.findElement(By.name("reg_passwd__")).sendKeys("Shara123");
         
//         Thread.sleep(2000);
         
         WebElement dayDD = driver.findElement(By.id("day"));
         Select day = new Select(dayDD);
         day.selectByIndex(27);
         
         WebElement monthDD = driver.findElement(By.id("month"));
         Select month = new Select(monthDD);
         month.selectByVisibleText("Sep");
         
         WebElement yearDD = driver.findElement(By.id("year"));
         Select year = new Select(yearDD);
         year.selectByVisibleText("1993");
         
		driver.findElement(By.name("sex")).click();
		
		
	}
	

}
