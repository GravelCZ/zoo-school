package zoo.plazi;

import java.time.LocalDate;

import zoo.abstraktni.Plaz;

public class Had extends Plaz {

	public Had(LocalDate datumNarozeni, String jmeno, boolean zijeVCesku) {
		super(datumNarozeni, jmeno, zijeVCesku);
	}

	@Override
	public void vypisInformace() {
		super.vypisInformace();
		System.out.println("Jedná se o hada");
	}
}
