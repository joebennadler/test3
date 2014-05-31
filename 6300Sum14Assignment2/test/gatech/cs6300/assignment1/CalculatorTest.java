package gatech.cs6300.assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calcInstance = new Calculator();
		calcInstance.add(2, 5);
		assertEquals("2 + 5 is 7",7,calcInstance.getResult(),.0001);
	}

	@Test
	public void testAddNegatives() {
		Calculator calcInstance = new Calculator();
		calcInstance.add(-2, -5);
		assertEquals("-2 + -5 is -7",-7,calcInstance.getResult(),.0001);
	}
	
	@Test
	public void testAddDecimals() {
		Calculator calcInstance = new Calculator();
		calcInstance.add(2.3, 5.4);
		assertEquals("2.3 + 5.4 is 7.7",7.7,calcInstance.getResult(),.0001);
	}
	
	@Test
	public void testAddZero() {
		Calculator calcInstance = new Calculator();
		calcInstance.add(8, 0);
		assertEquals("8 + 0 is 8",8,calcInstance.getResult(),.0001);
	}
	
	
	@Test
	public void testSubtract() {
		Calculator calcInstance = new Calculator();
		calcInstance.subtract(84, 13);
		assertEquals("84 - 13 is 71",71,calcInstance.getResult(),.0001);
	}
	
	@Test
	public void testSubtractDecimals() {
		Calculator calcInstance = new Calculator();
		calcInstance.subtract(110.13, 84.12);
		assertEquals("110.13 - 84.12 is 26.01",26.01,calcInstance.getResult(),.0001);
	}
	
	@Test
	public void testSubtractNegatives() {
		Calculator calcInstance = new Calculator();
		calcInstance.subtract(-19, -42);
		assertEquals("-19 - -42 is 23",23,calcInstance.getResult(),.0001);
	}
	
	@Test
	public void testSubtractZero() {
		Calculator calcInstance = new Calculator();
		calcInstance.subtract(-443, 0);
		assertEquals("-443 - 0 is -443",-443,calcInstance.getResult(),.0001);
	}

	@Test
	public void testMultiply() {
		Calculator calcInstance = new Calculator();
		calcInstance.multiply(1, 11);
		assertEquals("1 * 11 is 11",11,calcInstance.getResult(),.0001);
	}
	
	public void testMultiplyDecimals() {
		Calculator calcInstance = new Calculator();
		calcInstance.multiply(1.3, 9.5);
		assertEquals("1.3 * 9.5 is 12.35",12.35,calcInstance.getResult(),.0001);
	}
	
	public void testMultiplyNegatives() {
		Calculator calcInstance = new Calculator();
		calcInstance.multiply(-5, -6);
		assertEquals("-5 * -6 is 30",30,calcInstance.getResult(),.0001);
	}
	
	public void testMultiplyZero() {
		Calculator calcInstance = new Calculator();
		calcInstance.multiply(0, 11);
		assertEquals("0 * 11 is 0",0,calcInstance.getResult(),.0001);
	}

	@Test
	public void testDivide() {
		Calculator calcInstance = new Calculator();
		calcInstance.divide(20, 5);
		assertEquals("20 / 5 is 4",4,calcInstance.getResult(),.0001);
	}

	@Test
	public void testDivideDecimals() {
		Calculator calcInstance = new Calculator();
		calcInstance.divide(15.5, 2.5);
		assertEquals("15.5 / 2.5 is 6.2",6.2,calcInstance.getResult(),.0001);
	}
	
	@Test
	public void testDivideNegatives() {
		Calculator calcInstance = new Calculator();
		calcInstance.divide(-8, -2);
		assertEquals("-8 / -2 is 4",4,calcInstance.getResult(),.0001);
	}
	
	@Test
	public void testDivideZeroNumerator() {
		Calculator calcInstance = new Calculator();
		calcInstance.divide(0, 5);
		assertEquals("0 / 5 is 0",0,calcInstance.getResult(),.0001);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDivideZeroDenominator() {
		Calculator calcInstance = new Calculator();
		calcInstance.divide(5, 0);
	}
	
	@Test
	public void testGetResult() {
		Calculator calcInstance = new Calculator();
		calcInstance.multiply(5, 5);
		double outcome = calcInstance.result;
		assertEquals("Result value is 25. GetResult should return 25.",outcome,calcInstance.getResult(),.0001);
	}

}
