package zoo.savci;

import java.time.LocalDate;

import zoo.abstraktni.Savec;

public class Pes extends Savec {

	public Pes(LocalDate datumNarozeni, String jmeno, boolean zijeVCesku, double telesnaTeplota) {
		super(datumNarozeni, jmeno, zijeVCesku, telesnaTeplota);
	}

}
