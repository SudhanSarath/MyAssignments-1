package Week2.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LeaftabsLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Launch the browser
        ChromeDriver driver = new ChromeDriver();
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
        if(title.contains("TestLeaf")) {
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
		
		//Enter the First Name
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Sarath");
		
		//Enter the Last Name
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Kumar");
		
		//Click on Create Lead
		WebElement createLeadButton = driver.findElement(By.className("smallSubmit"));
		createLeadButton.click();
		
		//wait
		//Thread.sleep(2000);
				
		
		//Verify Lead Page
		//getText() --> used to get the text in the webpage
		//String leadPage = driver.findElement(By.tagName("title")).getText();
		//System.out.println(leadPage);
		
		
		
		
	}

}
