package com.softway.medical;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class MedicalApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	void testGetPathologiePatient() {
		var cardiologieEtTraumatologie = App.getPathologiePatient(15);
		var queTraumatologie = App.getPathologiePatient(10);
		var queCardiologie = App.getPathologiePatient(9);
		var pascardiologieEtTraumatologie = App.getPathologiePatient(11);
		assertEquals(cardiologieEtTraumatologie, "D'àpres votre index de santé, Vous devez aller à : Cardiologie, Traumatologie.");
		assertEquals(queTraumatologie, "D'àpres votre index de santé, Vous devez aller à : Traumatologie.");
		assertEquals(queCardiologie, "D'àpres votre index de santé, Vous devez aller à : Cardiologie.");
		assertEquals(pascardiologieEtTraumatologie, "Le nombre saisi n'est ni un multiple de 3 ni de 5 !");
	}

}
