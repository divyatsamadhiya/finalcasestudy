//package com.example.finalcasestudy.bdd;
//
//import static org.junit.jupiter.api.Assertions.assertAll;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.api.Test;
//
//import com.example.finalcasestudy.api.UserAPI;
//import com.example.finalcasestudy.api.UserDTO;
//
//public class UserTest {
//	
//	@DisplayName("Given there is an economy flight")
//	@Nested
//	class userRegister{
//		private UserAPI userapi;
//		@BeforeEach
//		void setUp() {
//			List<UserDTO> users = new ArrayList<>();
//			users.add(new UserDTO());
//			users.add(new UserDTO());
//			List<UserDTO> result = userapi.findAll().getBody();
//		}
//		@Nested
//		@DisplayName("When we have a usual passenger")
//		class findallregistration{
//			@Test
//			@DisplayName("Then you can add and remove him from an economy flight")
//			public void testAddAndRemove() {
//				assertAll("Verify all conditions for a usual passenger and an economy flight",
//						() -> assertEquals("2", result.length())
//						);
//		}
//		}
//	}
//
//}