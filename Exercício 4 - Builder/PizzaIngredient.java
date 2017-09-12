

public interface PizzaIngredient {
	
	public Dough createDough();
  	public  Sauce createSauce();
  	public  Cheese createCheese();
  	public Veggies[] createVeggies();
  	public  Pepperoni createPepperoni();
  	public  Clams createClam();
  	
  	 private PizzaIngredient();
  	  
  	  public Dough getcreateDough();
  	  
  	public Cheese getcreateCheese();
  	  public Sauce getcreateSauce();
  	  
  	  public Veggies[] getcreateVeggies() ;
  	  
  	  public Pepperoni getcreatePepperoni() ;
  	  
  	  public Clams getcreateClams() ;
  	  
  	}


