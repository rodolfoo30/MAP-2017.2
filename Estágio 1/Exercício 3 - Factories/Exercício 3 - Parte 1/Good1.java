
public class Good1 {

	

		  interface FabricaDeCarro {
		    CarroSedan criarCarroSedan();
		    CarroPopular criarCarroPopular();
		  }
		  class FabricaFiat implements FabricaDeCarro {
		 
		    @Override
		    public CarroSedan criarCarroSedan() {
		        return new Siena();
		    }
		 
		    @Override
		    public CarroPopular criarCarroPopular() {
		        return new Palio();
		    }
		  }
		  
		  
		  class FabricaFord implements FabricaDeCarro {
				 
			    @Override
			    public CarroSedan criarCarroSedan() {
			        return new KaS();
			    }
			 
			    @Override
			    public CarroPopular criarCarroPopular() {
			        return new Ka();
			    }
			  }
			  
		  interface CarroPopular {
		    void exibirInfoPopular();
		  }
		  interface CarroSedan {
		    void exibirInfoSedan();
		  }
		  
		  class Palio implements CarroPopular {
		 
		    @Override
		    public void exibirInfoPopular() {
		        System.out.println("Modelo: Palio\nFábrica: Fiat\nCategoria:Popular");
		    }
		  }
		  class Siena implements CarroSedan {
		 
		    @Override
		    public void exibirInfoSedan() {
		        System.out.println("Modelo: Siena\nFábrica: Fiat\nCategoria:Sedan");
		    }
		  }
		  
		  
		  class KaS implements CarroSedan {
				 
			    @Override
			    public void exibirInfoSedan() {
			        System.out.println("Modelo: Ka+\nFábrica: Fiat\nCategoria:Sedan");
			    }
			  }
		  
		  class Ka implements CarroPopular {
				 
			    @Override
			    public void exibirInfoPopular() {
			        System.out.println("Modelo: Ka\nFábrica: Fiat\nCategoria:Popular");
			    }
			  }
		  
		  public static void main(String[] args) {
			  
			Good1 g = new Good1();
			
		    FabricaDeCarro fabrica =g.new FabricaFiat();
		    CarroSedan sedan = fabrica.criarCarroSedan();
		    CarroPopular popular = fabrica.criarCarroPopular();
		    sedan.exibirInfoSedan();
		    System.out.println();
		    popular.exibirInfoPopular();
		    System.out.println();
		 
		    fabrica = g.new FabricaFord();
		    sedan = fabrica.criarCarroSedan();
		    popular = fabrica.criarCarroPopular();
		    sedan.exibirInfoSedan();
		    System.out.println();
		    popular.exibirInfoPopular();
		  }
		
}
