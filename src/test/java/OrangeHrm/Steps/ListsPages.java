package OrangeHrm.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListsPages {
    private WebDriver driver;

    public ListsPages(WebDriver driver){
        this.driver = driver;
    }

    public void roleCountry(String typeCountry){
        WebElement listCountry = driver.findElement(By.xpath("//*[text()='Country']//..//..//i"));
        listCountry.click();

        WebElement selectCountry =  listCountry.findElement(By.xpath("//*[text()= '"+typeCountry+"']"));
        selectCountry.click();
    }
}
