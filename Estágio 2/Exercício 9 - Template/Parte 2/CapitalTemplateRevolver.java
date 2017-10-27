
public class CapitalTemplateRevolver extends CapitalTemplate {

	@Override
	public double capital(Loan loan) {
	
		return capitalTemplate(loan)*loan.outStandingRiskAmount()+
				(loan.unusedRiskAmount()*loan.duration()*loan.unusedRiskFactorFor());
	}

}
