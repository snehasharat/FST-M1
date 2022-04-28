package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		System.out.print("Title is " + driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("DDDD");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("YYYYY");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ab@abcd.com");
		driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input")).click();
	}

}
