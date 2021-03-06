import java.text.DecimalFormat;
import java.text.NumberFormat;

public class SlotUm extends SlotCoF{

	public SlotUm(TipoDeSlot tipoDeSlot, double valorProduto) {
		super(tipoDeSlot, valorProduto);
	}

	@Override
	public void efetuaDeposito() {
		valor += TipoDeSlot.UM.getValor();
		if(valor >= valorProduto){
			NumberFormat formatter = new DecimalFormat("#0.00"); 
			System.out.println("Valor pago: " + formatter.format((valor)));
			System.out.println("Troco: " + formatter.format((valor - valorProduto)));
			return;
		}
	}

}
