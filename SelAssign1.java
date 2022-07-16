package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelAssign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//create username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		//get the attribute
				String attribute = logout.getAttribute("value");
				if(attribute.equals("Logout"))
				{
					System.out.println("Successfully Logged In");
	}
				//click CRM/SFA
				driver.findElement(By.linkText("CRM/SFA")).click();
				//click leads tab
				driver.findElement(By.linkText("Leads")).click();
				//click createlead
				driver.findElement(By.linkText("Create Lead")).click();
				//Company name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Capgemini");
				//First Name
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Firdouse");
				//Lastname
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Imran");
				//First name Local
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kinza");
				//Department name
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
				//Description name
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Welcome to Test Leaf");
				//Email Address
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("firdouse1910@abc.com");
				//Dropdown
				WebElement dropdown =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				//convert to select
				Select select=new Select(dropdown);
				//select value
				select.selectByVisibleText("New York");
				//click submit
				driver.findElement(By.className("smallSubmit")).click();
				String title=driver.getTitle();
				System.out.println(title);
				if(title.equals("View Lead | opentaps CRM"))
				{
					System.out.println("you are in correct page");
				
				}
}
}