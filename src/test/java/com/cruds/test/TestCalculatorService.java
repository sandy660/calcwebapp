package com.cruds.service;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorServiceTest {

	@Test
	public void add_ShouldReturnCorrectResult_WhenGivenTwoIntegers() {
		// Arrange
		int x = 2;
		int y = 3;
		int expectedResult = 5;

		// Act
		int result = CalculatorService.add(x, y);

		// Assert
		Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void subtract_ShouldReturnCorrectResult_WhenGivenTwoIntegers() {
		// Arrange
		int x = 5;
		int y = 3;
		int expectedResult = 2;

		// Act
		int result = CalculatorService.subtract(x, y);

		// Assert
		Assert.assertEquals(expectedResult, result);
	}

}
