package com.softway.medical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedicalApplication {

	public static void main(String[] args) {
		// change ça pour tester l'appli, ex: 15
		var index = 2;
		var result = App.getPathologiePatient(index);
		System.out.println(result);
		SpringApplication.run(MedicalApplication.class, args);
	}

}
