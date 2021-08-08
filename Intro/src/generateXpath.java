import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class generateXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Minnuz\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// xpath syntax: //Tagname[@attribute='value']

		driver.get(
				"https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("hello");

		// if change has to be applied for all attributes with same value just give
		// below syntax
		// *[attribute='value'
		driver.findElement(By.xpath("//*[@type='button']")).click();

		/*
		 * driver.findElement(By.xpath("//input[@type='email']")).sendKeys("123456789");
		 * driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		 * driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys(
		 * "minu");
		 * driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys(
		 * "john"); driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
		 * driver.findElement(By.xpath("//span[@class='jibhHc']")).getText();
		 */

	}

}
