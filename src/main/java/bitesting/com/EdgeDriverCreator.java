package bitesting.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverCreator extends WebDriverCreator {

    @Override
    public WebDriver createWebDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
}
