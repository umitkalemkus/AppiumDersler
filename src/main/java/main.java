import io.appium.java_client.AppiumDriver;
import io.appium.java_client.gecko.GeckoDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class main {


    public static void main(String[] args) throws MalformedURLException {






        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("udid","emulator-5554");
        desiredCapabilities.setCapability("appPackage","io.appium.android.apis");
        desiredCapabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");
        WebDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        //WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities); Daha kapsamli
      //  WebDriver driver = new GeckoDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);


        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]")).click();
        List<WebElement> elements = driver.findElements(By.id("android:id/text1"));

        for (WebElement elem:elements) {
            System.out.println(elem.getText());
        }
        
        
        //driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Custom Evaluator\"]")).click();




    














    }
}
