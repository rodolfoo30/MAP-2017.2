import java.util.Calendar.Builder;

public class PizzaChicagoBuilder implements PizzaIngredient {
	private Dough createDough;
	private  Sauce createSauce;
	private  Veggies[] createVeggies;
	private Pepperoni createPepperoni;
	private Clams createClams;

    /**
     * Constructor
     */
    public PizzaChicagoBuilder(Dough dough, Sauce sauce) {
		if (dough == null || sauce == null) {
        throw new IllegalArgumentException("dough and sauce can not be null");
      }
      this.createDough = dough;
      this.createSauce = sauce;
	  
    }
	
	

	public Builder withVeggies(Veggies veggies) {
      this.createVeggies = veggies;
      return this.createVeggies;
    }	

	
	public Builder withmPepperoni(Pepperoni pepperoni) {
      this.createPepperoni = pepperoni;
      return this.createPepperoni;
    }
	
	public Builder withClams(Clams clams) {
      this.createClams = clams;
      return this;
    }
	
	public Pizza build() {
      return new Pizza(this);
    }



	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Dough getcreateDough() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Cheese getcreateCheese() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Sauce getcreateSauce() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Veggies[] getcreateVeggies() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Pepperoni getcreatePepperoni() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Clams getcreateClams() {
		// TODO Auto-generated method stub
		return null;
	}


}
