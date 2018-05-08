package jamong;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcDiscountConditionTest {

	@Test
	public void testVIPConditionTrueFalse() {
		CalcDiscountCondition calcVIP = new CalcDiscountCondition();
		int result = calcVIP.clacDiscountRate("VIP", 3);
		assertEquals(0, result);
	}	
	
	@Test
	public void testVIPConditionFalseTrue() {
		CalcDiscountCondition calcVIP = new CalcDiscountCondition();
		int result = calcVIP.clacDiscountRate("VVIP", 6);
		assertEquals(0, result);
	}
	
	
/*	@Test
	public void testVIPCondition1True() { //TT
		CalcDiscountCondition calcVIP = new CalcDiscountCondition();
		int result = calcVIP.clacDiscountRate("VIP", 8);
		assertEquals(16, result);
	}
	
	@Test
	public void testVIPCondition1False() { //TF
		CalcDiscountCondition calcVIP = new CalcDiscountCondition();
		int result = calcVIP.clacDiscountRate("VIP", 0);
		assertEquals(0, result);
	}
	
	@Test
	public void testVIPCondition1False2() { //FT
		CalcDiscountCondition calcVIP = new CalcDiscountCondition();
		int result = calcVIP.clacDiscountRate("VVIP", 8);
		assertEquals(0, result);
	}
	
	@Test
	public void testVIPCondition1False3() { //FF
		CalcDiscountCondition calcVIP = new CalcDiscountCondition();
		int result = calcVIP.clacDiscountRate("VVIP", 0);
		assertEquals(0, result);
	}*/

}
