package hooks;

import baseclass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks extends BaseClass {

	@Before
	public void beforeScenario() {
//		chromeLaunch();
		browserLaunch("chrome");
		urlLaunch("https://prod.testrunz.com/");
		deleteAllCookies();
		maximize();
		impWait(60);
		
	}

	@After
	public void afterScenario() {
		impWait(30);
		quit();
	}
}
