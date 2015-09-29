package default_methods;

public interface Cupcoffee {
	
	public void zetten();
	
	default void bonenMalen(){
		System.out.println("bonen malen");
	}

}



