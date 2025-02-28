package com.tutorialsninja.qafox;

import com.tutorialsninja.qafox.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class WishlistPage extends BasePage{
    public WishlistPage(WebDriver driver) {
        super(driver);
    }
}
