package Week2.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		EdgeDriver driver = new EdgeDriver();
        //ChromeDriver driver = new ChromeDriver();
	    //FirefoxDriver driver = new FirefoxDriver();

		//Load the URL  
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Enter the Username
		driver.findElement(By.className("inputLogin")).sendKeys("DemoCSR");
		
		//wait
		Thread.sleep(2000);
		
		//Enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		//Click Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Verify the title
		String title = driver.getTitle();
        System.out.println(title);
        if(title.contains("Testleaf")) {
        	System.out.println("Leaftaps Login Successfully");
        }else
        {
        	System.out.println("Login failed");
        }
        		
		//Click CRM/SFA
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		
		//Click Leads tab
		WebElement leadsTab = driver.findElement(By.linkText("Leads"));
		leadsTab.click();
		
		//Click Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the Company Name
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Testleaf");
		companyName.clear();
		
		Thread.sleep(2000);
		
		companyName.sendKeys("QEagle");
		
		
		//Enter the First Name
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Sarath");
		
		//Enter the Last Name
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Kumar");
		 
		//Source Drop Down
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select source = new Select(sourceDD);
		
		source.selectByIndex(3); //Direct Mail
		
		Thread.sleep(2000);
		
		source.selectByVisibleText("Partner"); //Partner
		
		Thread.sleep(2000);
		
        source.selectByValue("LEAD_WEBSITE"); //Website
        
		Thread.sleep(2000);

		// Locate Marketing Campagain
		WebElement markCampDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select markcamp = new Select(markCampDD);
		markcamp.selectByValue("CATRQ_CARNDRIVER");
		
		
	}

}
