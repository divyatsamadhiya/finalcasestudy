package com.example.finalcasestudy;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FinalcasestudyApplication {
	
	@Bean
	public ModelMapper modelMapper() {
	return new ModelMapper();
	}
<<<<<<< HEAD


=======
	
>>>>>>> 47645842d94968c9bc7ef3d6615d4c69bef24cc5
	public static void main(String[] args) {
		SpringApplication.run(FinalcasestudyApplication.class, args);
	}

}
