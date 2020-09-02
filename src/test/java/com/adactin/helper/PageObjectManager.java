package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookAHotel;
import com.adactin.pom.HomePage;
import com.adactin.pom.MyItr;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {

	public static WebDriver driver;

	private HomePage hp;
	private SearchHotel sh;
	private SelectHotel seh;
	private BookAHotel bh;
	private MyItr mi;

	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public HomePage getHp() {
		hp = new HomePage(driver);
		return hp;
	}

	public SearchHotel getSh() {
		sh = new SearchHotel(driver);
		return sh;
	}

	public SelectHotel getSeh() {
		seh = new SelectHotel(driver);
		return seh;
	}

	public BookAHotel getBh() {
		bh = new BookAHotel(driver);
		return bh;
	}

	public MyItr getMi() {
		mi = new MyItr(driver);
		return mi;
	}

}