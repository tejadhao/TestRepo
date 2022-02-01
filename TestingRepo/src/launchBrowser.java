import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejaswini\\Desktop\\Tejaswini\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(3000);
        
        System.out.println(driver.getTitle());
	
	    driver.close();

	}

}
