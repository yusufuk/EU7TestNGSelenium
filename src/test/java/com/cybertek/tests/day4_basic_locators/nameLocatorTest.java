package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //maximize screen
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullNameInput = driver.findElement(By.name("full_name"));
                fullNameInput.sendKeys("asd kaos");

                //lazy way
                driver.findElement(By.name("email")).sendKeys("asd@cybertek.com");

                //proper way
                //WebElement emailInputBox = driver.findElement(By.name("email"));
        //emailInputBox.sendKeys("asd@sybertek.com");

        WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();


    }
}
