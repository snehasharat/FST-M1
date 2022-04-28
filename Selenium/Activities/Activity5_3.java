package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		System.out.println("Page title is " + driver.getTitle());
		WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println("Textbox enabled is " + textBox.isEnabled());
		driver.findElement(By.xpath("//*[@id=\"toggleInput\"]")).click();
		System.out.println("Textbox enabled is " + textBox.isEnabled());
		driver.close();
	}

}
