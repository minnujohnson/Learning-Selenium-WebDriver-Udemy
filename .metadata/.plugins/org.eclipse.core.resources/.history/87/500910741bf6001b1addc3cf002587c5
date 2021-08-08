import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Minnuz\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse((driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()));
		//assertion is part of TestNG framework and it validate the results, and allow test to continue only if it satisfies the critieria 
		//assertfalse expect a false to be returned inside the braces, otherwise condition fail
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		Assert.assertTrue((driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()));
		//check if checkbox is selected or not, and if true test continues.
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		//print total number of checkboxes, find it by writing a common css/xpath
	}

}
