package org.example.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.example.drivers.AndroidDriverInit;
import org.openqa.selenium.By;

public class BasePageObject {

  public AndroidDriver<AndroidElement> getDriver(){
    return AndroidDriverInit.driver;
  }

  public AndroidElement find(By by){
    return getDriver().findElement(by);
  }

  public void type(By by, String text){
    AndroidElement element = find(by);
    element.clear();
    element.sendKeys(text);
  }

  public void click(By by){
    find(by).click();
  }

  public String getText(By by){
    return find(by).getText();
  }

  public boolean isDisplayed(By by){
    return find(by).isDisplayed();
  }

}
