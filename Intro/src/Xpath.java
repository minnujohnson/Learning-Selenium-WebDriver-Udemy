import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.JavascriptExecutor;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Minnuz\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/?locale=in");

		/*
		 * for both chrome and firefox, in the webpage , right click on field, inspect,
		 * in the highlighted html code , again right click->copy->copy x path. after
		 * pasting in script remove the double quote of xpath and make it single quote
		 */

		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'error\']")).getText());

		// when x path starts with "html" its not reliable

		// sometime xpath won't work properly using above method, at that time use
		// javascript as below.

		// WebElement element=driver.findElement(By.xpath("//*[@id=\'u_0_d_uK\']"));
		// JavascriptExecutor js = (JavascriptExecutor)driver;
		// js.executeScript("argument[0].click();",element );

		// Actions action =new Actions(driver);
		// action.moveToElement(element).click().perform();

	}

}
