package jamong;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcDiscountMultipleConditionTest {

	@Test
	public void testVIPMcTT() { 
		CalcDiscountMultipleCondition calcVIP = new CalcDiscountMultipleCondition();
		int result = calcVIP.clacDiscountRate("VIP", 6);
		assertEquals(16, result);
	}
	
	@Test
	public void testVIPMcTF() { 
		CalcDiscountMultipleCondition calcVIP = new CalcDiscountMultipleCondition();
		int result = calcVIP.clacDiscountRate("VIP", 3);
		assertEquals(0, result);
	}
	
	@Test
	public void testVIPMcFT() {
		CalcDiscountMultipleCondition calcVIP = new CalcDiscountMultipleCondition();
		int result = calcVIP.clacDiscountRate("VVIP", 6);
		assertEquals(0, result);
	}
	
	@Test
	public void testVIPMcFF() { 
		CalcDiscountMultipleCondition calcVIP = new CalcDiscountMultipleCondition();
		int result = calcVIP.clacDiscountRate("VVIP", 3);
		assertEquals(0, result);
	}
}
