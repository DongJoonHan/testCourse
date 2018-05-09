package jamong;

public class CalcDiscount {

	// VIP 멤버십의 할인율 계산 

	public int clacDiscountRate(String membership, int payMonths) {
	
		int discountRate = 0;

		if(membership.equals("VIP") && payMonths >= 6) 
		discountRate = 16;
	
		if(membership.equals("VIP") && payMonths >= 12)
		discountRate = 20;
	
		if(membership.equals("VIP") && payMonths >= 18)
		discountRate = 25;

		return discountRate;
	}

}
