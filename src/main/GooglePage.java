package src.main;

public class GooglePage {
    
    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void testGoogleSearch() {
        driver.get("https://www.google.com");
    }
}
