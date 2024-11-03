import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Development_Avecto\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://www.naukri.com/mnjuser/homepage";
        String expectedTitle = "Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        Thread.sleep(4000);
        // get the actual value of the title
        actualTitle = driver.getTitle();
        System.out.println(actualTitle);    
        if(actualTitle.equals(expectedTitle)) {
        	System.out.println("Info Edge loaded successfully");        	
        }
        else {System.out.println("Info Edge not loaded ");}
        
        WebElement username = driver.findElement(By.xpath("//input[@id='usernameField']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='passwordField']"));
        
        username.sendKeys("azizurrahman1909@gmail.com");
		password.sendKeys("8982491887");
		//Thread.sleep(3000);
		WebElement Login = driver.findElement(By.xpath("//button[text()='Login']"));
		JavascriptExecutor jse =  (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", Login);
		//Login.click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Azizur Rahman')]")));
		
		Thread.sleep(4000);
		WebElement search = driver.findElement(By.xpath("//span[text()='Search jobs here']"));
		//search.click();
		jse.executeScript("arguments[0].click();", search);
		
		WebElement enterJavaSel = driver.findElement(By.xpath("//input[@placeholder=\"Enter keyword / designation / companies\"]"));
		
		enterJavaSel.sendKeys("Java Selenium");
		enterJavaSel.sendKeys(Keys.ENTER);
		
		WebDriverWait searchWait = new WebDriverWait(driver,30);
		WebElement seleniumJobs = searchWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Java Selenium Jobs']")));
		
		//Thread.sleep(3000);
		
		//WebElement seleniumJobs = driver.findElement(By.xpath("//h1[text()='Java Selenium Jobs']"));
		
		if(seleniumJobs.isDisplayed()) {
        	System.out.println("Java Selenium Jobs is visible");         	
        }
        else {System.out.println("Java Selenium Jobs is not visible ");
        }
		
		
		List<WebElement> jobID = driver.findElements(By.xpath("//div[contains(@class,\"job-listing-container\")]//div[@data-job-id]//li[contains(text(),'Selenium')][1]"));
		for (int i =0 ; i<n ;i++ ) {
			if (jobID[i].isDisplayed()) {
				
				 
			}
			
			
		}
        
		
		
	}

}
