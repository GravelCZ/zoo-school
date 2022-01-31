package zoo.savci;

import java.time.LocalDate;

import zoo.abstraktni.Savec;

public class Medved extends Savec {

	public Medved(LocalDate datumNarozeni, String jmeno, boolean zijeVCesku, double telesnaTeplota) {
		super(datumNarozeni, jmeno, zijeVCesku, telesnaTeplota);
	}

}
