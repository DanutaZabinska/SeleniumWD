package io.github.danutazabinska.seleniumwd;


	import org.junit.BeforeClass;
	import org.junit.Test;

	import io.ddavison.conductor.Browser;
	import io.ddavison.conductor.Config;
	import io.ddavison.conductor.Locomotive;

	@Config(browser = Browser.FIREFOX, url = "http://linea-bianca.strefa.pl/")

	public class Test1 extends Locomotive {
		  public static final String LOC_LNK_INDEX = " a[href$='index.html']";
		  public static final String LOC_IM_MALTAN = "#img1";
		  
			@BeforeClass
			public static void beforetests(){
				System.setProperty("webdriver.gecko.driver", "D:\\Danusia\\Testowanie\\geckodriver-v0.14.0-win64\\geckodriver.exe");
				
				
			}
			@Test
			public void testDoLinkToMainPageExists() {
				validatePresent(LOC_LNK_INDEX);
			}
			@Test
			public void testDoesMaltanExists() {
				validatePresent(LOC_IM_MALTAN);
			}
			@Test
			public void testCheckText() {
				validateText(LOC_LNK_INDEX, "Strona Główna");
			}
			
			@Test(expected = java.lang.AssertionError.class)
			public void testCheckTextWrong() {
				validateText(LOC_LNK_INDEX, "Wrong Text");
			}
		  
	}


