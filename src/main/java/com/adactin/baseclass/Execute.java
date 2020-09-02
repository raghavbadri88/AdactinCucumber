package com.adactin.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Execute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ragha\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\adactin\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.get("http://adactinhotelapp.com/");
	driver.findElement(By.id("username")).sendKeys("RaghavBadri");
	driver.findElement(By.id("password")).sendKeys("Test@123");
	driver.findElement(By.id("login")).click();
	
	WebElement selLoc = driver.findElement(By.xpath("//*[@id=\"location\"]"));
	Select sl = new Select(selLoc);
	sl.selectByVisibleText("Adelaide");
	
	WebElement seHot = driver.findElement(By.xpath("//*[@id=\"hotels\"]"));
	Select sh = new Select(seHot);
	sh.selectByVisibleText("Hotel Sunshine");
	
	WebElement selRmTy = driver.findElement(By.xpath("//*[@id=\"room_type\"]"));
	Select sr = new Select(selRmTy);
	sr.selectByValue("Double");
	
	WebElement selNoRooms = driver.findElement(By.xpath("//*[@id=\"room_nos\"]"));
	Select snr = new Select(selNoRooms);
	snr.selectByIndex(3);
	
	driver.findElement(By.id("datepick_in")).clear();
	Thread.sleep(500);
	driver.findElement(By.id("datepick_in")).sendKeys("20/08/2020");
	Thread.sleep(500);
	driver.findElement(By.xpath("//*[@id=\"datepick_out\"]")).clear();
	Thread.sleep(500);
	driver.findElement(By.xpath("//*[@id=\"datepick_out\"]")).sendKeys("25/08/2020");
	Thread.sleep(500);
	WebElement selNoAdlt = driver.findElement(By.xpath("//*[@id=\"adult_room\"]"));
	Select sa = new Select(selNoAdlt);
	sa.selectByVisibleText("1 - One");
	driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
	
	//Select Hotel
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input[1]")).click();
	driver.findElement(By.id("continue")).click();
	
	//Book A Hotel
	driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Adactin");
	driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Test");
	driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("82 Frost Lane \n Cross St \n Benway");
	driver.findElement(By.xpath("//*[@id=\"cc_num\"]")).sendKeys("4295093472893759");
	WebElement ccType = driver.findElement(By.xpath("//*[@id=\"cc_type\"]"));
	Select sct = new Select(ccType);
	sct.selectByVisibleText("VISA");
	
	WebElement expMth = driver.findElement(By.xpath("//*[@id=\"cc_exp_month\"]"));
	Select sem = new Select(expMth);
	sem.selectByVisibleText("March");
	
	WebElement expYr = driver.findElement(By.xpath("//*[@id=\"cc_exp_year\"]"));
	Select seyr = new Select(expYr);
	seyr.selectByVisibleText("2022");
	
	driver.findElement(By.xpath("//*[@id=\"cc_cvv\"]")).sendKeys("856");
	driver.findElement(By.name("book_now")).click();
	Thread.sleep(5000);
	
	//Booking Confirmation
	driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();
	Thread.sleep(500);
	driver.close();
	
	}

}