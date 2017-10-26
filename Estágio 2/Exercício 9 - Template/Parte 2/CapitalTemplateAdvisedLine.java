
public class CapitalTemplateAdvisedLine extends CapitalTemplate {
	
	public double unusedPercentageFor(Loan loan) {
		return loan.getUnusedPercentage();
	}

	@Override
	public double riskAmountFor(Loan loan) {
		return capital*loan.getCommitment;
	}

}
