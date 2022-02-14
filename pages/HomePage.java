package pages;

import Utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/*[1]")
    WebElement searchInput;
    @FindBy(xpath = "//input[@id='search-input']")
    WebElement pressCommand;
    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[3]")
    WebElement resultBARCELONA ;



    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchInput(String Item){
        searchInput.click();
        pressCommand.sendKeys("BARCELONA");
        resultBARCELONA.click();

    }

}