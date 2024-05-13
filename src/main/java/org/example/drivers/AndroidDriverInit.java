package org.example.drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverInit {

  public static AndroidDriver<AndroidElement> driver;

  public static void initialize()  {
    DesiredCapabilities set = new DesiredCapabilities();
    set.setCapability("platformName","Android");
//    set.setCapability("platformVersion","12");
    set.setCapability("deviceName","devices");
    set.setCapability("automationName","UIAutomator2");
    set.setCapability("udid","emulator-5554");
    set.setCapability("noReset","true");
    set.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/src/ApkTesting/9GAG_ Funny GIF, Meme & Video_8.10.13_APKPure.apk");


    String url = "http://0.0.0.0:4723/wd/hub";
    try {driver = new AndroidDriver<>
            (new URL(url),set);}
    catch (MalformedURLException e){ e.printStackTrace();}}

  public static void quit(){
    driver.quit();}

}
