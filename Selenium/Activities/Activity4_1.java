package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		System.out.println("Title is " + driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();
		System.out.println("New page title is " + driver.getTitle());
		driver.close();
	}

}
