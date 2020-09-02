package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.adactin.baseclass.BaseClass;
import com.adactin.helper.ConfigurationReader;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.BookAHotel;
import com.adactin.pom.HomePage;
import com.adactin.pom.MyItr;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.TestRunner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {

	@Before
	public void beforeScn(Scenario scn) {
		String name = scn.getName();
		System.out.println(name);
		// System.out.println("I am Before Hooks");

	}

	@After
	public void afterScn(Scenario scn) {
		String status = scn.getStatus();
		System.out.println(status);

	}

	public static WebDriver driver = TestRunner.driver;
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^User launch the Adactin Application$")
	public void user_launch_the_Adactin_Application() throws Throwable {
		System.out.println("I am Step1 from BackGround");
	}

	@When("^User logged in$")
	public void user_logged_in() throws Throwable {
		System.out.println("I am Step2 from BackGround");

	}

	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
		// driver = getBrowser("chrome");
		// ConfigurationReader cr = new ConfigurationReader();
		// String url = cr.getUrl();
		String url = FileReaderManager.getFrmInstance().grtCrInstance().getUrl();
		getUrl(url);
	}

	/*
	 * @When("^User enters valid Username in Username field$") public void
	 * user_enters_valid_Username_in_Username_field() throws Throwable {
	 * ElementValue(pom.getHp().getUname(), "RaghavBadri"); }
	 * 
	 * @When("^User enters valid Password in Password field$") public void
	 * user_enters_valid_Password_in_Password_field() throws Throwable {
	 * ElementValue(pom.getHp().getPwd(), "Test@123"); //ElementValue(hp.getPwd(),
	 * "Test@123"); }
	 */

	@When("^User enters valid \"([^\"]*)\" in Username field$")
	public void user_enters_valid_in_Username_field(String arg1) throws Throwable {
		ElementValue(pom.getHp().getUname(), arg1);
	}

	@When("^User enters valid \"([^\"]*)\" in Password field$")
	public void user_enters_valid_in_Password_field(String arg1) throws Throwable {
		ElementValue(pom.getHp().getPwd(), arg1);
	}

	@When("^User clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		ElementClick(pom.getHp().getLogin());
		// ElementClick(hp.getLogin());
		Thread.sleep(500);
	}

	@Then("^User verifies navigation to Search Hotel Page$")
	public void user_verifies_navigation_to_Search_Hotel_Page() throws Throwable {
		System.out.println("1st Scenario completed");
	}

	/*
	 * @When("^User selects valid Location$") public void
	 * user_selects_valid_Location() throws Throwable { //SearchHotel sh = new
	 * SearchHotel(driver); dropdown(pom.getSh().getLocation(), "London", "value");
	 * //dropdown(sh.getLocation(), "London", "value"); }
	 * 
	 * @When("^User selects Hotel$") public void user_selects_Hotel() throws
	 * Throwable { //SearchHotel sh = new SearchHotel(driver);
	 * //dropdown(sh.getHotel(), "Hotel Sunshine", "visibleText");
	 * dropdown(pom.getSh().getHotel(), "Hotel Sunshine", "visibleText"); }
	 * 
	 * @When("^User selects Number of Rooms$") public void
	 * user_selects_Number_of_Rooms() throws Throwable {
	 * dropdown(pom.getSh().getRoomType(), "3", "index");
	 * dropdown(pom.getSh().getRoomNos(), "2", "value"); }
	 */

	@When("^User selects valid Location \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_selects_valid_Location_as(String arg1, String arg2) throws Throwable {
		dropdown(pom.getSh().getLocation(), arg1, arg2);

	}

	@When("^User selects Hotel \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_selects_Hotel_as(String arg1, String arg2) throws Throwable {
		dropdown(pom.getSh().getHotel(), arg1, arg2);

	}

	@When("^User selects Number of Rooms \"([^\"]*)\" as \"([^\"]*)\" and \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_selects_Number_of_Rooms_as_and_as(String arg1, String arg2, String arg3, String arg4)
			throws Throwable {
		dropdown(pom.getSh().getRoomType(), arg1, arg2);
		dropdown(pom.getSh().getRoomNos(), arg3, arg4);
	}

	@When("^User selects Check In \"([^\"]*)\" and Check Out \"([^\"]*)\" Dates$")
	public void user_selects_Check_In_and_Check_Out_Dates(String arg1, String arg2) throws Throwable {
		pom.getSh().getChkInDate().clear();
		ElementValue(pom.getSh().getChkInDate(), arg1);
		pom.getSh().getChkOutdate().clear();
		ElementValue(pom.getSh().getChkOutdate(), arg2);
	}

	@When("^User selects Adults per Room \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_selects_Adults_per_Room_as(String arg1, String arg2) throws Throwable {
		dropdown(pom.getSh().getAdultPerRoom(), arg1, arg2);
	}

	/*
	 * @When("^User selects Check In and Check Out Dates$") public void
	 * user_selects_Check_In_and_Check_Out_Dates() throws Throwable {
	 * pom.getSh().getChkInDate().clear(); ElementValue(pom.getSh().getChkInDate(),
	 * "10/09/2020"); pom.getSh().getChkOutdate().clear();
	 * ElementValue(pom.getSh().getChkOutdate(), "17/09/2020");
	 * 
	 * }
	 * 
	 * @When("^User selects Adults per Room$") public void
	 * user_selects_Adults_per_Room() throws Throwable {
	 * dropdown(pom.getSh().getAdultPerRoom(), "3 - Three", "visibleText"); }
	 */

	@When("^User clicks on Search button$")
	public void user_clicks_on_Search_button() throws Throwable {
		ElementClick(pom.getSh().getSearch());
		Thread.sleep(500);

	}

	@Then("^User navigates to Hotel Results Page$")
	public void user_navigates_to_Hotel_Results_Page() throws Throwable {
		System.out.println("2nd Scenario completed");
	}

	@Given("^User enters all required info in Search Hotel page$")
	public void user_enters_all_required_info_in_Search_Hotel_page() throws Throwable {

	}

	@When("^User selects required hotel result as per price$")
	public void user_selects_required_hotel_result_as_per_price() throws Throwable {
		ElementClick(pom.getSeh().getSelecthotel());

	}

	@When("^User clicks on Continue button$")
	public void user_clicks_on_Continue_button() throws Throwable {
		ElementClick(pom.getSeh().getContinue());

	}

	@Then("^User navigates to Book A Hotel Page$")
	public void user_navigates_to_Book_A_Hotel_Page() throws Throwable {
		System.out.println("3rd Scenario completed");

	}

	@Given("^User selects the hotel as per price$")
	public void user_selects_the_hotel_as_per_price() throws Throwable {

	}

	@When("^User enters Billing Details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enters_Billing_Details(String arg1, String arg2, String arg3) throws Throwable {
		ElementValue(pom.getBh().getFname(), arg1);
		ElementValue(pom.getBh().getLname(), arg2);
		ElementValue(pom.getBh().getBaddr(), arg3);
	}

	@When("^User enters Card Details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enters_Card_Details(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6,
			String arg7, String arg8) throws Throwable {
		ElementValue(pom.getBh().getCcno(), arg1);
		dropdown(pom.getBh().getCctype(), arg2, arg3);
		dropdown(pom.getBh().getExMth(), arg4, arg5);
		dropdown(pom.getBh().getExpYr(), arg6, arg7);
		ElementValue(pom.getBh().getCvv(), arg8);
		Thread.sleep(2000);
	}

	/*
	 * @When("^User enters Billing Details$") public void
	 * user_enters_Billing_Details() throws Throwable {
	 * ElementValue(pom.getBh().getFname(), "Adactin");
	 * ElementValue(pom.getBh().getLname(), "Cucumber");
	 * ElementValue(pom.getBh().getBaddr(), "87 Jasmine lane\nCross St\nFreeWay");
	 * 
	 * }
	 * 
	 * @When("^User enters Card Details$") public void user_enters_Card_Details()
	 * throws Throwable { ElementValue(pom.getBh().getCcno(), "8526974136575289");
	 * Thread.sleep(100); dropdown(pom.getBh().getCctype(), "1", "index");
	 * Thread.sleep(100); dropdown(pom.getBh().getExMth(), "October",
	 * "visibleText"); Thread.sleep(100); dropdown(pom.getBh().getExpYr(), "2022",
	 * "value"); Thread.sleep(100); ElementValue(pom.getBh().getCvv(), "571");
	 * Thread.sleep(100); ElementClick(pom.getBh().getBookNow());
	 * Thread.sleep(2000);
	 * 
	 * }
	 */

	@Then("^User navigates to Booking Confirmation Page$")
	public void user_navigates_to_Booking_Confirmation_Page() throws Throwable {
		System.out.println("4th Scenario completed");

	}

	@Given("^User views Booking Confirmation Page$")
	public void user_views_Booking_Confirmation_Page() throws Throwable {

	}

	@When("^User clicks on Logout button$")
	public void user_clicks_on_Logout_button() throws Throwable {
		ElementClick(pom.getMi().getItenary());
		Thread.sleep(100);
		ElementClick(pom.getMi().getLgout());
		Thread.sleep(100);
	}

	@Then("^User verifies successful logout message$")
	public void user_verifies_successful_logout_message() throws Throwable {
		System.out.println("5th Scenario completed");

	}

}
