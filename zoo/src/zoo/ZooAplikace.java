package zoo;

import java.time.LocalDate;

import zoo.abstraktni.Plaz;
import zoo.abstraktni.Savec;
import zoo.abstraktni.Zvire;
import zoo.plazi.Had;
import zoo.plazi.Krokodyl;
import zoo.plazi.Zelva;
import zoo.savci.Medved;
import zoo.savci.Pes;

public class ZooAplikace {

	public static void main(String[] args) {
		LocalDate datumNarození = LocalDate.parse("2022-05-12");
		
		//obecné
		Zvire z = new Zvire(datumNarození, "Obecné zvíře", false);
		z.vypisInformace();
		
		Savec s = new Savec(datumNarození, "Obecný savec", true, 28.568d);
		s.vypisInformace();
		s.vydejZvuk("Mrk");
		
		Plaz p = new Plaz(datumNarození, "Obecný plaz", true);
		p.vypisInformace();
		
		//plazi
		Had had = new Had(datumNarození, "Had", true);
		had.vypisInformace();
		
		Krokodyl krokodyl = new Krokodyl(datumNarození, "Dandee", false);
		krokodyl.vypisInformace();
		
		Zelva zelva = new Zelva(datumNarození, "Zelva III. Posvátná Habsburkská", true);
		zelva.vypisInformace();
		
		//savci
		Medved medved = new Medved(datumNarození, "Nedvěd", true, 35.5);
		medved.vypisInformace();
		
		Pes pes = new Pes(datumNarození, "Sep", true, 28.2);
		pes.vypisInformace();
	}

}
