package zoo.abstraktni;

import java.time.LocalDate;

public class Plaz extends Zvire {

	public static final boolean TEPLOKREVNOST = false;
	
	public Plaz(LocalDate datumNarozeni, String jmeno, boolean zijeVCesku) {
		super(datumNarozeni, jmeno, zijeVCesku);
	}
		
	@Override
	public void vypisInformace() {
		System.out.println("Zvíøe je plaz a je studenokrevné");
		System.out.println("Jméno: " + (this.jmeno == null ? "Beze jména" : this.jmeno));
		System.out.println("Datum narození: " + (datumNarozeni == null ? "nedefinováno" : datumNarozeni.format(formatter)));
	}
}
