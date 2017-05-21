package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception {
	
	private RateDomainModel rate_domain_model;

	public RateDomainModel getRate_domain_model() {
		return rate_domain_model;
	}

	public void setRate_domain_model(RateDomainModel rate_domain_model) {
		
		this.rate_domain_model = rate_domain_model;
	}	
	public RateException(RateDomainModel rate_domain_model){
		this.rate_domain_model = rate_domain_model;
	}
	

}
