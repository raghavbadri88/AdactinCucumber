package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel {
	public static WebDriver driver;

	public BookAHotel(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement fname;
	
	@FindBy(id = "last_name")
	private WebElement lname;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[14]/td[2]/textarea")
	private WebElement baddr;
	
	@FindBy(name = "cc_num")
	private WebElement ccno;
	
	@FindBy(id = "cc_type")
	private WebElement cctype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement exMth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expYr;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(name = "book_now")
	private WebElement BookNow;
	
	@FindBy(name = "my_itinerary")
	private WebElement MyItr;
	
	@FindBy(name = "logout")
	private WebElement Logout;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getBaddr() {
		return baddr;
	}

	public WebElement getCcno() {
		return ccno;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExMth() {
		return exMth;
	}

	public WebElement getExpYr() {
		return expYr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNow() {
		return BookNow;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getMyItr() {
		return MyItr;
	}

	public WebElement getLogout() {
		return Logout;
	}

}
