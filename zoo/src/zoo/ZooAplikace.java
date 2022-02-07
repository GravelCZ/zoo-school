package zoo;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

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
		LocalDate datumNarozen� = LocalDate.parse("2021-05-12");
		
		List<Integer> krmeni = new ArrayList<>();
		krmeni.add(15);
		krmeni.add(10);
		krmeni.add(18);
		
		//obecn�
		Zvire z = new Zvire(datumNarozen�, "Obecn� zv��e", false);
		z.vypisInformace();
		
		Savec s = new Savec(datumNarozen�, "Obecn� savec", true, 28.568d);
		s.vypisInformace();
		s.vydejZvuk("Mrk");
		
		Plaz p = new Plaz(datumNarozen�, "Obecn� plaz", true);
		p.vypisInformace();
		
		//plazi
		Had had = new Had(datumNarozen�, "Had", true);
		had.setHodinyKrmeni(krmeni);
		had.setPocetKrmeniZaDen(krmeni.size());
		had.vypisInformace();
		
		Krokodyl krokodyl = new Krokodyl(datumNarozen�, "Dandee", false);
		krokodyl.setHodinyKrmeni(krmeni);
		krokodyl.setPocetKrmeniZaDen(krmeni.size());
		krokodyl.vypisInformace();
		
		Zelva zelva = new Zelva(datumNarozen�, "Zelva III. Posv�tn� Habsburksk�", true);
		zelva.setHodinyKrmeni(krmeni);
		zelva.setPocetKrmeniZaDen(krmeni.size());
		zelva.vypisInformace();
		
		//savci
		Medved medved = new Medved(datumNarozen�, "Nedv�d", true, 35.5);
		medved.setHodinyKrmeni(krmeni);
		medved.setPocetKrmeniZaDen(krmeni.size());
		medved.vypisInformace();
		
		Period vek = medved.zjistiVek();
		System.out.println("Medved je star�: " + vek.getYears() + " let, " + vek.getMonths() + " m�s�c� a " + vek.getDays() + " dn�");
		
		Pes pes = new Pes(datumNarozen�, "Sep", true, 28.2);
		pes.setHodinyKrmeni(krmeni);
		pes.setPocetKrmeniZaDen(krmeni.size());
		pes.vypisInformace();
	}

}
