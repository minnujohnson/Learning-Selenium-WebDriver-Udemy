import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// selenium code
		// these java classes are called test cases
		// chromedriver.exe file is the driver for chrome browser and it should be
		// invoked here
		// webdriver.chrome.driver is a property of the class ChromeDriver

		System.setProperty("webdriver.chrome.driver", "C:\\Minnuz\\work\\chromedriver.exe");

		// create chrome driver object to use chrome browser

		WebDriver driver = new ChromeDriver();

		// Webdriver is the return type here and we use all the methods in it for
		// automation

		driver.get("http:\\google.com");
		System.out.println(driver.getTitle());// validate if the title is correct
		// we call all methods using driver object.

		child ch = new child();// create obj for child class
		ch.header(); // access methods in child class using objects

		System.out.println(driver.getCurrentUrl()); // validate if the url we hit is the right or not
		// because sometime it will be hacked and redirect to another website.

		// System.out.println(driver.getPageSource());//this will display the sourcecode
		// of the page we are hitting.
		// normally we can see it by right click on the page.
		// but sometime its disabled for some site.

		driver.get("https://yahoo.com"); // navigate to yahoo from google ,bcz google was called at line 21
		driver.navigate().back(); // this will help to go back to previous page
		driver.navigate().forward();// help to go to next page

		driver.close();// close the current browser after execution.
		// driver.quit(); close all the windows opened by selenium script

	}

}
