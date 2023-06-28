package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactoryPage extends BasePage {
    @FindBy (id = "boton")
    WebElement boton;

    public PageFactoryPage(){
        super(driver);
        driver.get("www.google.com");
    }
}
