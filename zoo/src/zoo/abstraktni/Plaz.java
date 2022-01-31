package zoo.abstraktni;

import java.time.LocalDate;

public abstract class Plaz extends Zvire {

	public static final boolean TEPLOKREVNOST = false;
	
	public Plaz(LocalDate datumNarozeni, String jmeno, boolean zijeVCesku) {
		super(datumNarozeni, jmeno, zijeVCesku);
	}
		
	
}
