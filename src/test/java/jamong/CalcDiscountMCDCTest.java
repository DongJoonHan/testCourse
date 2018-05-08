package jamong;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcDiscountMCDCTest {

	@Test
	public void testVIPMcdc1() {
		CalcDiscountMCDC calcVIP = new CalcDiscountMCDC();
		int result = calcVIP.clacDiscountRate("VIP", 6);
		assertEquals(16, result);
	}	
	
	@Test
	public void testVIPMcdc2() {
		CalcDiscountMCDC calcVIP = new CalcDiscountMCDC();
		int result = calcVIP.clacDiscountRate("VIP", 3);
		assertEquals(0, result);
	}
	
	@Test
	public void testVIPMcdc3() {
		CalcDiscountMCDC calcVIP = new CalcDiscountMCDC();
		int result = calcVIP.clacDiscountRate("VVIP", 6);
		assertEquals(0, result);
	}

}
