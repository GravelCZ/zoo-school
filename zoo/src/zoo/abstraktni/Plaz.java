package zoo.abstraktni;

import java.time.LocalDate;

public class Plaz extends Zvire {

	public static final boolean TEPLOKREVNOST = false;
	
	public Plaz(LocalDate datumNarozeni, String jmeno, boolean zijeVCesku) {
		super(datumNarozeni, jmeno, zijeVCesku);
	}
		
	@Override
	public void vypisInformace() {
		System.out.println("Zv��e je plaz a je studenokrevn�");
		System.out.println("Jm�no: " + (this.jmeno == null ? "Beze jm�na" : this.jmeno));
		System.out.println("Datum narozen�: " + (datumNarozeni == null ? "nedefinov�no" : datumNarozeni.format(formatter)));
	}
}
