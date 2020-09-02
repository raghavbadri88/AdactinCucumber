package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyItr {
	
	public static WebDriver driver;

	public MyItr(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")
	private WebElement itenary;
	
	@FindBy(id = "logout")
	private WebElement lgout;

	public WebElement getItenary() {
		return itenary;
	}

	public WebElement getLgout() {
		return lgout;
	}

}
