package zoo.abstraktni;

import java.time.LocalDate;

public abstract class Savec extends Zvire {

	public static final boolean TEPLOKREVNOST = true;
	
	private double telesnaTeplota;
	
	public Savec(LocalDate datumNarozeni, String jmeno, boolean zijeVCesku, double telesnaTeplota) {
		super(datumNarozeni, jmeno, zijeVCesku);
		this.telesnaTeplota = telesnaTeplota;
	}
	
	public void vydejZvuk(String citoslovce) {
		System.out.println(citoslovce);
	}
	
	
}
