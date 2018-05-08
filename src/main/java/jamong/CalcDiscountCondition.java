package jamong;

public class CalcDiscountCondition {

	// VIP 멤버십의 할인율 계산 

	public int clacDiscountRate(String membership, int payMonths) {
	
		int discountRate = 0;

		if(membership.equals("VIP") == true && payMonths >= 6)
		{	

			discountRate = 16;
		}
		
		
/*		if(membership.equals("VIP") == true)
		{	
			if(payMonths >= 6)
			{

				discountRate = 16;
			}
		}
		*/

		
		
		/*
		System.out.println("in if: " + (membership.equals("VIP") == true) + (payMonths >= 6));
		System.out.println("out if: " + membership + payMonths);
		 */
			
/*		if(membership.equals("VIP") == true && payMonths >= 12)
		discountRate = 20;
	
		if(membership.equals("VIP") == true && payMonths >= 18)
		discountRate = 25;*/

		return discountRate;
	}
	
/*	public void result(String membership, int payMonths) {
		System.out.println("in if: " + (membership.equals("VIP") == true) + (payMonths >= 6));
		//System.out.println("out if: " + membership + payMonths);
	}*/
}
