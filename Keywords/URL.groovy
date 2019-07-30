import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.Cookie
public class URL {
	@Keyword

	def OpenBrowser(String url) {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver_win32\\chromedriver.exe")

		ChromeOptions options = new ChromeOptions()

		options.addArguments("–no-sandbox")

		options.addArguments("–disable-dev-shm-usage")

		options.setExperimentalOption("useAutomationExtension", false)

		WebDriver driver = new ChromeDriver()

		DriverFactory.changeWebDriver(driver);

		driver.get(url);
	}
}


