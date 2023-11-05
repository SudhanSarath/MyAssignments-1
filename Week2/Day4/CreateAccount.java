package Week2.Day4;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.edge.EdgeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        ChromeDriver driver = new ChromeDriver();
	    
		//Load the URL  
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Enter the Username
		driver.findElement(By.className("inputLogin")).sendKeys("DemoCSR");
		
		//Enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		//Click Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click CRM/SFA
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		
		//Click Accounts tab
		WebElement accountsTab = driver.findElement(By.linkText("Accounts"));
		accountsTab.click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Yubhashana");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		
		Select industry = new Select(industryDD);
		industry.selectByValue("IND_SOFTWARE");
		
		
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		
	    Select ownership = new Select(ownershipDD);
	    ownership.selectByVisibleText("S-Corporation");
	    
        WebElement datasourceDD = driver.findElement(By.name("dataSourceId"));
		
	    Select datasource = new Select(datasourceDD);
	    datasource.selectByValue("LEAD_EMPLOYEE");
	    
        WebElement marketingDD = driver.findElement(By.name("marketingCampaignId"));
		
	    Select marketing = new Select(marketingDD);
	    marketing.selectByIndex(6);
	    
        WebElement stateDD = driver.findElement(By.name("generalStateProvinceGeoId"));
		
	    Select state = new Select(stateDD);
	    state.selectByValue("TX");
	    
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.close();
         	    
	    
	    
	}
	
	

}
