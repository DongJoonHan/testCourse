package jamong;

public class CalcDiscount {

	// VIP ������� ������ ��� 

	public int clacDiscountRate(String membership, int payMonths) {
	
		int discountRate = 0;

		if(membership == "VIP" && payMonths >= 6) 
		discountRate = 16;
	
		if(membership == "VIP" && payMonths >= 12)
		discountRate = 20;
	
		if(membership == "VIP" && payMonths >= 18)
		discountRate = 25;

		return discountRate;
	}

}
