package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void gotoGroupCreation() {
        click(By.linkText("groups"));
    }
}
