
public abstract class CapitalTemplate {
	
	public double capital(Loan loan) {
		
		return riskAmountFor(loan)* duration(loan)*riskFactorFor(loan);
	}
	
	public abstract double riskAmountFor(Loan loan);
	
	public double unusedPercentageFor(Loan loan) {
		return capital(loan);
	}
	
	

}
