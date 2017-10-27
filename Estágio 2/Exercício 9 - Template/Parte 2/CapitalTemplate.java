
public abstract class CapitalTemplate {
	
	public double capitalTemplate(Loan loan) {
		
		return loan.duration()*loan.riskFacrotyFor();
	}
	
	public abstract double capital(Loan loan);
	
	public double duration(Loan loan) {
		
		return loan.duration();
	}
	
	protected double riskFactorFor(Loan loan) 
	{
		return loan.riskFacrotyFor();
	}
	

	
	

}
