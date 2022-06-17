package com.stepdefinition1;

import com.Maven_Project.baseclass;
import com.pomclass1.Page_Object_Manager;
import com.properties1.File_Reader_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition extends baseclass{
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	
	@Given("^user must launch the url$")
	public void user_must_launch_the_url() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().get_url();
		urllaunch (url);
	}

	@When("^user enter the username$")
	public void user_enter_the_username() throws Throwable {
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().get_username();
		passinput(pom.getInstanceLogin().getUsername(),username);
	}

	@When("^user enter the password$")
	public void user_enter_the_password() throws Throwable {
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().get_password();
		passinput(pom.getInstanceLogin().getPassword(),password);
	}

	@Then("^user click the login button and navigates to search hotel$")
	public void user_click_the_login_button_and_navigates_to_search_hotel() throws Throwable {
		clickelement(pom.getInstanceLogin().getLogin());
	}

	@When("^user select the location$")
	public void user_select_the_location() throws Throwable {
		select (pom.getInstanceLogin().getLocation(), "ByIndex", "4");
	}

	@When("^user select the hotel$")
	public void user_select_the_hotel() throws Throwable {
		select (pom.getInstanceLogin().getHotels(), "ByIndex", "3");
	}

	@When("^user select the roomtype$")
	public void user_select_the_roomtype() throws Throwable {
		select (pom.getInstanceLogin().getRoomtype(), "ByIndex", "2");
	}

	@When("^user select the noofrooms$")
	public void user_select_the_noofrooms() throws Throwable {
		select (pom.getInstanceLogin().getRoomnos(),"ByIndex", "3");
	}

	@When("^user enter the checkin date$")
	public void user_enter_the_checkin_date() throws Throwable {
		String checkin = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckin();
		pom.getInstanceLogin().getCheckin().clear();
		passinput (pom.getInstanceLogin().getCheckin(),checkin);
	}

	@When("^user enter the checkout date$")
	public void user_enter_the_checkout_date() throws Throwable {
		String checkout = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckout();
        pom.getInstanceLogin().getCheckout().clear();
        passinput(pom.getInstanceLogin().getCheckout(),checkout);
	}

	@When("^user select adultsperroom$")
	public void user_select_adultsperroom() throws Throwable {
		select (pom.getInstanceLogin().getAdultroom(),"ByIndex", "3");
	}

	@When("^user select the childrenperroom$")
	public void user_select_the_childrenperroom() throws Throwable {
		select(pom.getInstanceLogin().getChildroom(),"ByIndex", "1");
	}

	@Then("^user click the search button and navigates to search hotel$")
	public void user_click_the_search_button_and_navigates_to_search_hotel() throws Throwable {
		 clickelement (pom.getInstanceLogin().getSubmit());
	}
}
