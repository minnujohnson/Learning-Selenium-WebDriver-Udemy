import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Minnuz\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		Thread.sleep(3000L);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		//findelements is plural, bcz we are fetching all the options which satisfies the css selector
		//List<Webelemnt>  is the return type of findelements, create an oject for it and store it there
		
		for(WebElement option : options)//enhanced for loop, which means everytime loop iterate pick one item from options and store in variable option
		{
			
			if(option.getText().equalsIgnoreCase("India"))
					{
				option.click();
				break;
					}
		}
		
	}

}
