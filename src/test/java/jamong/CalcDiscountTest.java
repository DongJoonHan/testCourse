package jamong;

import static org.junit.Assert.*;

import org.junit.Test;

// statement coverage
public class CalcDiscountTest {

	@Test
	public void testVIP1() {
		CalcDiscount calcVIP = new CalcDiscount();
		int result = calcVIP.clacDiscountRate("VIP", 6);
		assertEquals(16, result);
	}
		
	@Test
	public void testVIP2() {
		CalcDiscount calcVIP = new CalcDiscount();
		int result = calcVIP.clacDiscountRate("VIP", 12);
		assertEquals(20, result);
	}
		
	@Test
	public void testVIP3() {
		CalcDiscount calcVIP = new CalcDiscount();
		int result = calcVIP.clacDiscountRate("VIP", 18);
		assertEquals(25, result);
	}

	
	/*
	@Test
	public void testVIP4() {
		CalcDiscount calcVIP = new CalcDiscount();
		int result = calcVIP.clacDiscountRate("Silver", 6);
		assertEquals(0, result);
	}*/


}
