import java.util.Iterator;
import java.util.List;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LimitDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Minnuz\\work2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//1.get count of all urls in the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
//2.get count of all urls in footer section
		
		//created a mini driver who has access to only footer 
		//limited the webdriver scope to footer
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
//3.get count of all urls in footer cpolumn 1
		
	WebElement column=	driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul[1]"));
System.out.println(column.findElements(By.tagName("a")).size());	

//4.click on each url in column
List<WebElement> a=column.findElements(By.tagName("a"));

Actions act=new Actions(driver);
for (int i=1;i<a.size();i++)
{
	//open url in new tab (ctrl+enter) allows that.
	act.moveToElement(column.findElements(By.tagName("a")).get(i)).keyDown(Keys.CONTROL).click().build().perform();
	Thread.sleep(5000L);
}

//5. get page title of each tab

Set<String> st=driver.getWindowHandles();
Iterator<String> it=st.iterator();

while(it.hasNext())
{
	driver.switchTo().window(it.next());
	System.out.println(driver.getTitle());
}


	}
}
