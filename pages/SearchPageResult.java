package pages;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageResult extends BasePage{

    @FindBy(xpath="//header/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/*[1]")
    WebElement searchInput;

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[3]")
    WebElement resultBARCELONA;


    public SearchPageResult(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement searchFlagLogo(){
        return searchInput;
    }

    public WebElement resultBARCELONA(){
        return resultBARCELONA;
    }

}