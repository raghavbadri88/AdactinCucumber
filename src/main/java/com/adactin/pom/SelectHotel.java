package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	public static WebDriver driver;

	public SelectHotel(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement selecthotel;

	@FindBy(xpath = "//input[@name='continue']")
	private WebElement Continue;

	public WebElement getSelecthotel() {
		return selecthotel;
	}

	public WebElement getContinue() {
		return Continue;
	}

}
