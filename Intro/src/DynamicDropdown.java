import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Minnuz\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(2000L);// to give some time for test cases to run, to avoid sync issue

		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		// there are two fields with same xpath, seleium will try to catch the first
		// match, but we want the
		// second match, hence put xpath in a bracket and give [2]

		// driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']
		// //a[@value='MAA']")).click();
		// parent-child relationship xpath: syntax : parentxpath childxpath
	}

}
