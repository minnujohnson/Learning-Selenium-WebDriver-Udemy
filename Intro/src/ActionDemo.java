import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Minnuz\\work2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		Actions a = new Actions(driver);
//Actions is  a class to handle mouse/keyboard interactions

		// moves to specific element
		a.moveToElement(driver.findElement(By.xpath("//a[@id=\'nav-link-accountList\']"))).build().perform();

//.build will make the code ready for execution.  .perform make it executable

		// to make letters in upper case we hold shift key and enter letter.
		// so we use keydown(keys.SHIFT) method here
		// double click will help to select the text
		a.moveToElement(driver.findElement(By.xpath("//input[@id=\'twotabsearchtextbox\']"))).click()
				.keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().perform();
		
		//webelemnt will help to store the element in a variable.which will make our code easy
		WebElement move=driver.findElement(By.xpath("//a[@id=\'nav-link-accountList\']"));
		a.moveToElement(move).contextClick().build().perform();
		//contextclick helps to right click on the element

	}
}
