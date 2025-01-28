package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ErrorPage {
    WebDriver driver;

    public ErrorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void elementControl(By path) {
        try {
            WebDriverWait waitElement = new WebDriverWait(driver, Duration.ofSeconds(5));
            waitElement.until(ExpectedConditions.visibilityOfElementLocated(path));
        }
        catch (TimeoutException e) {
            throw new TimeoutException("Öge Bulunamadı: " + path.toString());
        }
    }

}
