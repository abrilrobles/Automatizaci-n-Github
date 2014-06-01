package usj.renting;

public class SedanPrice extends Price{
	 int getPriceCode(){
		 return Car.SEDAN;
	 }
	 
	 double getCharge(int daysRented){
		  double result = 1.5;
		   if (daysRented > 3)
		       result += (daysRented - 3)*1.5;
		  return result;
	 }
	 
	 int getLoyaltyPoints(int daysRented){
		 return 1;
	 } 
	 
	 
	 
}
