package usj.renting;

public class LimousinePrice extends Price{
 int getPriceCode(){
	 return Car.LIMOUSINE;
 }
  
 double getCharge(int daysRented){
   return daysRented * 3; 
   }
 
 int getLoyaltyPoints(int daysRented){
		if(daysRented > 1)
	    		return 2;
	    else
	    		return 1;
		// return(daysRented > 1) ? 2:1
 }
 
}
