package my.programs;

public class SellingPrice {

	public static void main(String[] args) {
		 
		double price = 4500 ;
		double discount;
		
		if(price < 1000)
		{
			price = price;
		}
		
		else if((price >= 1000)&&(price < 10000))
		{
			discount = (price/100)*10;
			price = price-discount;
			
		}
		
		else if((price >= 10000)&&(price <= 20000))
		{
			discount = (price/100)*20;
			price = price-discount;
			
		}
		
		else if(price>20000)
		{
			price = price;
		}
		System.out.println("Selling price is ="+price);

	}

}
