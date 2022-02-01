import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejaswini\\Desktop\\Tejaswini\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
   
        
   
        
        driver.findElement(By.name("cusid")).sendKeys("12345");
        driver.findElement(By.name("submit")).click();
        Thread.sleep(3000);
        
        
   
        
        //switch to alert
        
        Alert alert = driver.switchTo().alert();
        
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(3000);
        		
        // Accepting alert		
        alert.accept();		
    
        
        driver.close();
	}

	}


