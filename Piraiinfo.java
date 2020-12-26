package tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Piraiinfo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"E:\\SoftwareTesting\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://piraiinfo.com/");
		
		Thread.sleep(3000);
		WebElement aboutUs = driver.findElement(By.linkText("About Us"));
		aboutUs.click();
			
		Thread.sleep(3000);
		WebElement  dataServices = driver.findElement(By.linkText("Data Services"));
		dataServices.click();
		
		Thread.sleep(3000);
		WebElement  cloudServices = driver.findElement(By.linkText("Cloud Services"));
		cloudServices.click();
		
		Thread.sleep(3000);
		WebElement  devOPSServices = driver.findElement(By.linkText("DevOps Services"));
		devOPSServices.click();
		
		Thread.sleep(3000);
		WebElement contactUs = driver.findElement(By.linkText("Contact Us"));
		contactUs.click();
		
		WebElement name = driver.findElement(By.xpath("/html/body/div/div/div/article/div/div/div/div/div[4]/div/div/div/div/form/p[1]/span/input"));
		name.sendKeys("Arunkumar Buvaneswaran");
		
		WebElement email = driver.findElement(By.xpath("/html/body/div/div/div/article/div/div/div/div/div[4]/div/div/div/div/form/p[2]/span/input"));
		email.sendKeys("barun238@gmail.com");
		
		WebElement phoneNumber = driver.findElement(By.name("tel-23"));
		phoneNumber.sendKeys("+919789250307");
		
		WebElement message = driver.findElement(By.name("textarea-112"));
		message.sendKeys("I have completed my code challenge that was assigned to me. \r\n" + 
				"Please find the below link for the source code of my project.\r\n" + 
				"https://github.com/barun238/Selenium\r\n" + 
				"I will send an email along with PPT explaining about the use case of my project.");
		
		WebElement submitButton = driver.findElement(By.xpath("/html/body/div/div/div/article/div/div/div/div/div[4]/div/div/div/div/form/p[5]/input"));
		submitButton.click();

	}

}
