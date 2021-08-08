import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Minnuz\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		// inspect the webpage , get id/class/name/linktext for the locator , and pass
		// it in script.
		driver.findElement(By.id("email")).sendKeys("minnujohnson4@gmail.com");// passed id locator

		driver.findElement(By.name("pass")).sendKeys("123456");// passed name locator

		driver.findElement(By.linkText("Forgotten password?")).click(); // passed linktext
		// whereever there is a link in the browser you can use the name displayed on
		// the webpage as linktext.

	}

}
