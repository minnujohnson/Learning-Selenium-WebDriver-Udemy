import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Minnuz\\work2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a.blinkingText")).click();

		Set<String> window = driver.getWindowHandles(); // retun a set of parent and child windows's ids
		Iterator<String> it = window.iterator();
		String parent = it.next();// by default 'it' is out of the set. in next() ctrl comes to 0 index
		String child = it.next();// ctrl in 1 st index
		driver.switchTo().window(child);

		String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

		driver.switchTo().window(parent);
		driver.findElement(By.cssSelector("#username")).sendKeys(email);

	}

}
