package com.softway.medical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedicalApplication {

	public static void main(String[] args) {
		var result = App.getPathologiePatient(2);
		System.out.println(result);
		SpringApplication.run(MedicalApplication.class, args);
	}

}
