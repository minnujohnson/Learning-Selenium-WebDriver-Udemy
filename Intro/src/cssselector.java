import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Minnuz\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");

		/*
		 * for firefox,in the webpage , right click on field, inspect, in the
		 * highlighted html code , again right click->copy->copy selector
		 */

		/*
		 * for chrome, there is no direct way to select css selector. click on the
		 * inspected element, and in bottom click on each styles and find the right css.
		 */

		// css selector syntax : Tagname[attribute='value']
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("email");

		// if change has to be applied for all attributes with same value just removed
		// "tagname" from the syntax
		// [attribute='value']
		driver.findElement(By.cssSelector("[name='pass']")).sendKeys("password");
		driver.findElement(By.cssSelector("button[type='submit']")).click();

		/*
		 * there is a simplest way to write css , when there is an id field. tagname#id
		 * using class, below is the syntax tagname.classname
		 */

	}

}
