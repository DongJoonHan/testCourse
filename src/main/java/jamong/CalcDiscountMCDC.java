package jamong;

public class CalcDiscountMCDC {

	// VIP ������� ������ ��� 

	public int clacDiscountRate(String membership, int payMonths) {
	
		int discountRate = 0;

		if(membership.equals("VIP") == true && payMonths >= 6) 
		discountRate = 16;
	
/*		if(membership.equals("VIP") == true && payMonths >= 12)
		discountRate = 20;
	
		if(membership.equals("VIP") == true && payMonths >= 18)
		discountRate = 25;*/

		return discountRate;
	}
}
