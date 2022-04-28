package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
	driver.get("https://training-support.net/selenium/simple-form");
		
	System.out.println("Title is " + driver.getTitle());
	
	WebElement firstName = driver.findElement(By.id("firstName"));
	WebElement lastName = driver.findElement(By.id("lastName"));
	
	firstName.sendKeys("SSSS");
	lastName.sendKeys("BBBBB");
	
	WebElement email = driver.findElement(By.id("email"));
	WebElement contact = driver.findElement(By.id("number"));
	
	email.sendKeys("aaa@abcd.com");
	contact.sendKeys("1234567890");
	
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("input.green")).click();
	
	driver.close();
	
	}

}
