package firstRTSProj;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
    import org.openqa.selenium.Keys;
    import org.openqa.selenium.WebElement;

	import org.openqa.selenium.chrome.ChromeDriver;


	public class NavigateToSite {
		
		ChromeDriver driver;

		String url = "http://www.google.com";
		
		public void invokeBrowserHP(){
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\pamwh\\eclipse-workspace\\lib\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
			driver.get(url);
	
		}

		public void closeBrowser() {
			
			//driver.close(); //To close current active window
			
			//driver.quit();  //To close all the windows
		}
		
		
		public static void main(String[] args) {
			
			NavigateToSite WknWSite = new NavigateToSite();
			
			WknWSite.invokeBrowserHP ();
			
			WknWSite.enterGoogleQueryString ();
			
			WknWSite.selectFirstReturnedItem();
			
			WknWSite.closeBrowser();
		
		}		
		

		public void enterGoogleQueryString () {
		
			WebElement queryField = driver.findElement(By.name("q"));
		
			queryField.sendKeys("RTS Labs");
		
			queryField.sendKeys(Keys.ENTER); 	
	
		}
	
		
		public void selectFirstReturnedItem () {
		
			driver.findElement(By.xpath("/html/body/div[7]/div/div[8]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div[1]/a")).click();

		}
}

