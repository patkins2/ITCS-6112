package cn.anxcyun.www.po;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DoctorTest {

	@Test
	void testGetUsername() {
		Doctor test = new Doctor("Anna", "doctor1@gmail.com", "2121 Red Lane","qwe123QWE", "888-888-7878","F", 3, "surgery department");
		Assert.assertEquals("getUsername() is wrong", "Anna", test.getUsername());
	}


	@Test
	void testGetEmail() {
		Doctor test = new Doctor("Anna", "doctor1@gmail.com", "2121 Red Lane","qwe123QWE", "888-888-7878","F", 3, "surgery department");
		Assert.assertEquals("GetEmail() is wrong", "doctor1@gmail.com", test.getEmail());
	}

}
