package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title = driver.getTitle();
		System.out.println("Title is " + title);
		
		WebElement idLocator = driver.findElement(By.id("about-link"));
		System.out.println("Text in element - id " + idLocator.getText());
		
		WebElement classNameSelector = driver.findElement(By.className("green"));
		System.out.println("Text in element - className " + classNameSelector.getText());
		
		WebElement linkText = driver.findElement(By.linkText("About Us"));
		System.out.println("Text in element - linkText " + linkText.getText());
		
		WebElement cssLocator =  driver.findElement(By.cssSelector("#about-link"));
		System.out.println("Text in element - cssLocator " + cssLocator.getText());
		
		driver.close();
	}

}
