package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-attributes");
		System.out.println("Title is " + driver.getTitle());
		WebElement username = driver.findElement(By.xpath("//input[starts-with(@class, 'username-')]"));
		WebElement password = driver.findElement(By.cssSelector("input[class^='password-']"));
		username.sendKeys("admin");
		password.sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button")).click();
		String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
		System.out.println(loginMessage);
		
		driver.close();
	}

}
