package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementControlPage {
    WebDriver driver;
    WebDriverWait wait;

    public ElementControlPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void moveToElement(By path) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", driver.findElement(path));
    }

    public void elementVisibilityV1(By path) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(path));
            moveToElement(path);
            driver.findElement(path).click();
        }
        catch (TimeoutException e) {
            throw new TimeoutException("Öge Bulunamadı: " + path.toString());
        }
    }
    public void elementVisibilityV2(By path) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(path));
            driver.findElement(path).click();
        }
        catch (TimeoutException e) {
            throw new TimeoutException("Öge Bulunamadı: " + path.toString());
        }
    }
}
