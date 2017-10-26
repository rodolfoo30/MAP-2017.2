
public class CapitalTemplateTermLoan extends CapitalTemplate {	
	
	@Override
	public double riskAmountFor(Loan loan) {
		return capital*loan.getCommiment();
	}
	
	

}
