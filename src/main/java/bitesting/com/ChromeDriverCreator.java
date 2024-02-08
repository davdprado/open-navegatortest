package bitesting.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverCreator extends WebDriverCreator {

    @Override
    public WebDriver createWebDriver() {
        WebDriverManager.chromedriver().setup(); // Configura el controlador WebDriver de Chrome
        return new ChromeDriver();
    }
}
