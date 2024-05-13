package org.example.pages;


import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.example.base.BasePageObject;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

import static org.example.drivers.AndroidDriverInit.driver;

public class LoginPage extends BasePageObject {

    public void landingPage() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        By locator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view." +
                "ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx." +
                "recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.S" +
                "crollView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[2]");
        AndroidElement landing = driver.findElement(locator);
        landing.isDisplayed();

    }

    public void tapProfilButton(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        By locator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout." +
                "widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view." +
                "ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.ScrollView/" +
                "android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView");
        AndroidElement tapProfilButton = driver.findElement(locator);
        tapProfilButton.click();

    }

    public void tapSignUpOrLogInButton(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        By locator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android." +
                "widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view." +
                "ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/" +
                "androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
        AndroidElement tapSignUpOrLogInButton = driver.findElement(locator);
        tapSignUpOrLogInButton.click();

    }

    public void tapLogInButton(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        By locator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout" +
                "/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]");
        AndroidElement tapLogInButton = driver.findElement(locator);
        tapLogInButton.click();

    }

    public void setEmail(String email) {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        By locator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android." +
                "widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/" +
                "androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.EditText[1]");
        AndroidElement inputPhoneNumber = driver.findElement(locator);
        inputPhoneNumber.click();
        driver.getKeyboard().sendKeys(email);
        driver.hideKeyboard();

    }

    public void setPassword(String password) {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        By locator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android." +
                "widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/" +
                "androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.EditText[2]");
        AndroidElement inputPhoneNumber = driver.findElement(locator);
        inputPhoneNumber.click();
        driver.getKeyboard().sendKeys(password);
        driver.hideKeyboard();

    }

    public void tapLogin() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        By locator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android." +
                "widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.compose." +
                "ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[4]/android.widget.Button");
        AndroidElement loginButton = driver.findElement(locator);
        loginButton.click();
       }
//===============================================
    public void failedVerifyPage() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        By locator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView");
        AndroidElement failedVerifyPage = driver.findElement(locator);
        failedVerifyPage.isDisplayed();

    }
//===============================================
public void disableButton() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    By locator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android." +
            "widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.compose." +
            "ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[4]/android.widget.Button");
    AndroidElement disableButton = driver.findElement(locator);
    disableButton.isDisplayed();

    }


}
