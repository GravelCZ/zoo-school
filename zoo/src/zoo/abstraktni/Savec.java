package zoo.abstraktni;

import java.time.LocalDate;

public class Savec extends Zvire {

	public static final boolean TEPLOKREVNOST = true;
	
	private double telesnaTeplota;
	
	public Savec(LocalDate datumNarozeni, String jmeno, boolean zijeVCesku, double telesnaTeplota) {
		super(datumNarozeni, jmeno, zijeVCesku);
		this.telesnaTeplota = telesnaTeplota;
	}
	
	public void vydejZvuk(String citoslovce) {
		System.out.println(citoslovce);
	}
	
	public double getTelesnaTeplota() {
		return telesnaTeplota;
	}
	
	public void setTelesnaTeplota(double telesnaTeplota) {
		this.telesnaTeplota = telesnaTeplota;
	}
}
