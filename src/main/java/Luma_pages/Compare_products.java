package Luma_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Compare_products {
    WebDriver driver;

    By deleteFirstprodust= new By.ByCssSelector(".cell.remove.product.hidden-print:nth-of-type(1)>a");
    By deleteSecondprodust= new By.ByCssSelector(".cell.remove.product.hidden-print:nth-of-type(2)>a");

    public Compare_products(WebDriver driver) {
        this.driver = driver;
    }
    public void clickdeletebtn(){
        driver.findElement(deleteFirstprodust).click();
        driver.switchTo().alert().accept();
        driver.findElement(deleteSecondprodust).click();
        driver.switchTo().alert().accept();
    }
    public void handlealert(){
        driver.switchTo().alert().accept();
    }
}
