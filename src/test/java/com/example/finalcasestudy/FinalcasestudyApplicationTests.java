package com.example.finalcasestudy;




import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import com.example.finalcasestudy.api.FlightAPI;
import com.example.finalcasestudy.api.FlightDTO;
import com.example.finalcasestudy.api.FlightFacade;

@SpringBootTest
public class FinalcasestudyApplicationTests {



@InjectMocks
FlightAPI flightapi;

@Mock
FlightFacade flightFacade;






@Test
void contextLoads() {
}

@Test
public void testFindAll()
{
// given


List<FlightDTO> flights = new ArrayList<>();
flights.add(new FlightDTO());


//products.add(new Product());

when(flightFacade.findAll()).thenReturn(flights);



// when
List<FlightDTO> result = flightapi.findAll().getBody();

// then
assertThat(result.size()).isEqualTo(1);

// assertThat(result.get(0).getFirstName())
// .isEqualTo(employee1.getFirstName());
//
// assertThat(result.getEmployeeList().get(1).getFirstName())
// .isEqualTo(employee2.getFirstName());
}

}
