package jamong;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcDiscountDecisionConditionTest {

	@Test
	public void testVIPDC1() {
		CalcDiscountDecisionCondition calcVIP = new CalcDiscountDecisionCondition();
		int result = calcVIP.clacDiscountRate("VVIP", 3);
		assertEquals(0, result);
	}	
	
	@Test
	public void testVIPDC2() {
		CalcDiscountDecisionCondition calcVIP = new CalcDiscountDecisionCondition();
		int result = calcVIP.clacDiscountRate("VIP", 6);
		assertEquals(16, result);
	}	
}
