package cn.anxcyun.www.po;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PatientsTest {
	@Test
	void testGetUsername() {
		Patients test = new Patients("Anna", "anna@gmail.com", "2121 Red Lane","qwe123QWE", "888-888-7878","F", "03-05-88", "none");
		Assert.assertEquals("getUsername() is wrong", "Anna", test.getUsername());
	}

	@Test
	void testGetEmail() {
		Patients test = new Patients("Anna", "anna@gmail.com", "2121 Red Lane","qwe123QWE", "888-888-7878","F", "03-05-88", "none");
		Assert.assertEquals("GetEmail() is wrong", "anna@gmail.com", test.getEmail());
	}

}
