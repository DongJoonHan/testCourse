package jamong;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcDiscountBranchTest {

	@Test
	public void testVIPBrachTrue() {
		CalcDiscountBranch calcVIP = new CalcDiscountBranch();
		int result = calcVIP.clacDiscountRate("VIP", 6);
		assertEquals(16, result);
	}
	
	@Test
	public void testVIPBrachFalse() {
		CalcDiscountBranch calcVIP = new CalcDiscountBranch();
		int result = calcVIP.clacDiscountRate("VIP", 3);
		assertEquals(0, result);
	}

}
