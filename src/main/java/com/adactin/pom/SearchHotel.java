package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public static WebDriver driver;

	public SearchHotel(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='location']")
	private WebElement Location;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement Hotel;

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement RoomType;

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement RoomNos;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement ChkInDate;

	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement ChkOutdate;
	
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement AdultPerRoom;

	@FindBy(name = "Submit")
	private WebElement Search;

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getRoomNos() {
		return RoomNos;
	}

	public WebElement getChkInDate() {
		return ChkInDate;
	}

	public WebElement getChkOutdate() {
		return ChkOutdate;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getAdultPerRoom() {
		return AdultPerRoom;
	}

	public WebElement getSearch() {
		return Search;
	}

}
