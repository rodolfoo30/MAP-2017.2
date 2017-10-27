
public class CapitalTemplateAdvisedLine extends CapitalTemplate {

	@Override
	public double capital(Loan loan) {
		
		return capitalTemplate(loan)*loan.getCommiment();
	}
	
	



}
