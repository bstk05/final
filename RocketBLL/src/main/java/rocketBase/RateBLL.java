package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static double Rates = 0;
	private static RateDAL _RateDAL = new RateDAL();
	
	static double getRate(int GivenCreditScore) throws RateException 
	{
		
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		
		double dInterestRate = 0;
		
		RateDomainModel rate_domain_model1 = new RateDomainModel();
		
		
		for (RateDomainModel RD : rates){
			
			if (GivenCreditScore >= RD.getiMinCreditScore()) {
				
				Rates = RD.getdInterestRate();
			}
			
			if (Rates == 0){
				
				throw new RateException(rate_domain_model1);
				
			}
		}
		return Rates;
		
		
		
		
		
		//return dInterestRate;
		
		
	}
	
	
	
	
	

	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{	
		
		if (r != 0){
			(p*(1 + r)^n + y(1 + r*t)((1+r)^n-1)/r + f) = 0;
		}
		else{
			(n*y + p + f) = 0;  
			
		}
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
