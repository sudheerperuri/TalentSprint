package my.programs;

public class CalculateSpeed {

	public static void main(String[] args) {
		
		int disInMts	= 25581;
		double km		= disInMts/1000.0;
		double mile		= disInMts/1609.0;
		
		int timeInHr	= 3;
		int timeInMin 	= 23;
		int timeInSec 	= 45;
		
		double totalHr 	= timeInHr+(timeInMin/60.0)+(timeInSec/3600.0);
		double totalSec	= (timeInHr*3600)+(timeInMin*60)+timeInSec;
		
		double speedInMts	= disInMts/totalSec;
		double speedInKms 	= km/totalHr;
		double speedInMile	= mile/totalHr;
		
		System.out.println("Speed in Mts	= "+speedInMts+"\n"+
						    "Speed in Kms	= "+speedInKms+"\n"+
							"Speed in Mile	= "+speedInMile);
	}

}
