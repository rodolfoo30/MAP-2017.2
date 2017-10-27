
public class CapitalTemplateTermLoan extends CapitalTemplate {	
	

	@Override
	public double capital(Loan loan) {
		return capitalTemplate(loan)*loan.getCommiment();
	}
	
	public double duration(Loan loan) {
		
		return loan.duration();
	}
	

}
