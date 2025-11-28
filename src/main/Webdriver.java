package src.main;

import org.openqa.selenium.WebDriver;


public class Webdriver {
    private WebDriver driver;

    public Webdriver(WebDriver driver) {
        this.driver = driver;
    }

    public void get(String url) {
        driver.get(url);
    }

    public void quit() {
        driver.quit();
    }
}
