package io.github.danutazabinska.seleniumwd;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Test2 {

	
	static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Danusia\\Testowanie\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
//		driver = new ChromeDriver();
	}
	
	@Test
	public void ShouldBeTitleLikeExpected() throws InterruptedException {
		
		String baseUrl = "http://linea-bianca.strefa.pl/";
		String expectedTitle = "Linea Bianca - Hodowla Psów Rasowych FCI";
		String actualTitle = " ";

		driver.get(baseUrl);
		
		actualTitle = driver.getTitle();
		if (actualTitle.contains(expectedTitle)) {
			System.out.println("Test Passed");
		} else {

			System.out.println("Test Failed");
		}
		
	
		
		
	}	
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
//		System.exit(0);
	}
}