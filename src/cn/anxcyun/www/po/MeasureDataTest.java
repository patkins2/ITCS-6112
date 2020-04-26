package cn.anxcyun.www.po;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MeasureDataTest {

	@Test
	void test1() {

		MeasureData test = new MeasureData("04/26/2020", "5'4", "110","120/80", "3.0","98.6");
		Assert.assertEquals("getBloodPressure() is wrong", "120/80", test.getBloodPressure());
	}


	@Test
	void test2() {

		MeasureData test = new MeasureData("04/26/2020", "5'4", "110","120/80", "3.0","98.6");
		Assert.assertEquals("getHeight() is wrong", "5'4", test.getHeight());
	}
}
