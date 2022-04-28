package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		System.out.println("Page title is " + driver.getTitle());
		WebElement checkboxDisplayed = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));
		System.out.println("Checkbox displayed is " + checkboxDisplayed.isDisplayed());
		driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]")).click();
		System.out.println("Checkbox displayed is " + checkboxDisplayed.isDisplayed());
		driver.close();
	}

}
