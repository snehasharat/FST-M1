package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		System.out.println("Page title is " + driver.getTitle());
		WebElement checkboxSelected = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));
		System.out.println("Checkbox Selected is " + checkboxSelected.isSelected());
		driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input")).click();
		System.out.println("Checkbox Selected is " + checkboxSelected.isSelected());
		driver.close();
	}
}
