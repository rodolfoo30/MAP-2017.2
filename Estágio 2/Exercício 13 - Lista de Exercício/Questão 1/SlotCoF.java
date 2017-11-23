
public abstract class SlotCoF {

	protected SlotCoF next;
	protected TipoDeSlot tipoDeSlot;
	protected static double valor = 0;
	protected double valorProduto;

	public SlotCoF(TipoDeSlot tipoSlot, double valorProduto) {
		this.next = null;
		this.tipoDeSlot = tipoSlot;
		this.valorProduto = valorProduto;
	}

	public void setNext(SlotCoF slot) {
		if (this.next == null) {
			this.next = slot;
		} else {
			this.next.setNext(slot);
		}
	}

	public void efetuarDeposito(TipoDeSlot tipoSlot) {
		if (podeDepositar(tipoSlot)) {
			efetuaDeposito();
		} else {
			if (next == null) {
				System.out.println("Slot não existe.");
				return;
			}
			next.efetuarDeposito(tipoSlot);
		}
	}

	public boolean podeDepositar(TipoDeSlot tipoDeSlot) {
		return this.tipoDeSlot == tipoDeSlot;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public abstract void efetuaDeposito();


}
