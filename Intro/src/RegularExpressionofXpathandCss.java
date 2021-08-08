import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpressionofXpathandCss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Minnuz\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://codepen.io/login");

		// xpath syntax: //tagname[contains(@attribute,'value')]
		driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("minu");

		// css syntax" //tagname[attribute*='value']
		driver.findElement(By.cssSelector("input[type*=pass")).sendKeys("1234");

	}

}
