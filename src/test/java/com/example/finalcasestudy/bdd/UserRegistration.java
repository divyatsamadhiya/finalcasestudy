package com.example.finalcasestudy.bdd;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import com.example.finalcasestudy.api.UserAPI;
import com.example.finalcasestudy.api.UserDTO;
import com.example.finalcasestudy.api.UserFacade;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserRegistration {
	
	private UserAPI userapi;
	private UserFacade userFacade;
	
	
	@Given("^there is an online portal for registration$")
	public void there_is_an_online_portal_for_registration() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<UserDTO> users = new ArrayList<>();
		users.add(new UserDTO());
		users.add(new UserDTO());
	}

	@When("^a user register on that portal$")
	public void a_user_register_on_that_portal() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<UserDTO> result = userapi.findAll().getBody();
	}

	@Then("^you can add him in the user database$")
	public void you_can_add_him_in_the_user_database() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertAll("Verify all conditions for a usual passenger and an economy flight",
				() -> assertEquals("2", result.length()));
	}

}
