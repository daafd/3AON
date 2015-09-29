package oefeningen;

import java.util.ArrayList;

public class oefeningThread {

	
	public static void main(String[] args) throws InterruptedException {
    ArrayList<Persoon> lijst=new ArrayList<Persoon>();
    int i=1;
	while(i>0){
		Persoon persoon= new Persoon(Integer.toString(i),"aaaa",20);
		lijst.add(persoon);
		
		System.out.println(persoon.printgegevens());
		i++;
		Thread.sleep(1000);
		
	}
	
		

	}
	
	
	

}
