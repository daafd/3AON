package default_methods;

public class Testkoffiezet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Capp capo = new Capp();
		Late laté= new Late();
		Regular gewoon = new Regular();
		
		capo.bonenMalen();
		laté.bonenMalen();
		gewoon.bonenMalen();
		
		capo.zetten();
		laté.zetten();
		gewoon.zetten();
		

	}

}
