
public class CapitalTemplateRevolver extends CapitalTemplate {

	@Override
	public double riskAmountFor(Loan loan) {
		return capital+(loan.unusedRiskAmount()*unusedRiskFactor(loan)*duration(loan))
	}
	

}
