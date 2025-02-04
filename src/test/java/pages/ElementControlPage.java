package pages;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

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

    public static File takeScreenshot(WebDriver driver) throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Path screenshotDir = Path.of("src/test/java/screenshots");
        if (!Files.exists(screenshotDir)) {
            Files.createDirectories(screenshotDir);
        }
        String fileName = "screenshot_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".png";
        Path destination = screenshotDir.resolve(fileName);
        Files.copy(screenshot.toPath(), destination, StandardCopyOption.REPLACE_EXISTING);
        return destination.toFile();
    }

    public static void sendingMail(File screenshotFile) throws EmailException {
        HtmlEmail email = new HtmlEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("eneskaynak2002@gmail.com", "khsm qnok pjuw rhka"));
        email.setSSLOnConnect(true);
        email.setFrom("eneskaynak2002@gmail.com", "Test Automation");
        email.setSubject("Selenium Test Raporu");
        email.setMsg("Test basarisiz oldu. Ekteki ekran görüntüsüne bakabilirsiniz.");

        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath(screenshotFile.getAbsolutePath());
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Hata Ekran Görüntüsü");
        attachment.setName(screenshotFile.getName());
        email.attach(attachment);

        email.addTo("soymacetin@gmail.com");
        email.send();
    }

    public void elementVisibilityV1(By path) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(path));
            moveToElement(path);
            driver.findElement(path).click();
        } catch (TimeoutException e) {
            try {
                File screenshot = takeScreenshot(driver);
                sendingMail(screenshot);
            } catch (IOException | EmailException ex) {
                ex.printStackTrace();
            }
            throw new TimeoutException("Öge Bulunamadı: " + path.toString());
        }
    }

    public void elementVisibilityV2(By path) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(path));
            driver.findElement(path).click();
        } catch (TimeoutException e) {
            try {
                File screenshot = takeScreenshot(driver);
                sendingMail(screenshot);
            } catch (IOException | EmailException ex) {
                ex.printStackTrace();
            }
            throw new TimeoutException("Öge Bulunamadı: " + path.toString());
        }
    }
}