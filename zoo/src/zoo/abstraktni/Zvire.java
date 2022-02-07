package zoo.abstraktni;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zvire {

	protected LocalDate datumNarozeni;
	private List<Integer> hodinyKrmeni = new ArrayList<>();
	private int pocetKrmeniZaDen; // nestaÄilo by hodinyKrmeni.size(); ?
	protected String jmeno;
	private boolean zijeVCesku;
	
	protected static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM YYYY");
	
	public Zvire(LocalDate datumNarozeni, String jmeno, boolean zijeVCesku) {
		this.datumNarozeni = datumNarozeni;
		this.jmeno = jmeno;
		this.zijeVCesku = zijeVCesku;
	}
	
	public void vypisInformace() {
		System.out.println("Datum narození: " + (datumNarozeni == null ? "nedefinováno" : datumNarozeni.format(formatter)));	
		System.out.println("Poèet hodin krmení za den: " + this.pocetKrmeniZaDen);
		// rychlé pøedìlání èísel do Stringu, miluji javu 8
		if (!hodinyKrmeni.isEmpty()) {
			System.out.println("Èasy krmení: " + String.join(", ", hodinyKrmeni.stream().map(e -> {
				return String.valueOf(e);
			}).collect(Collectors.toList())));	
		}
		System.out.println("Jméno: " + (this.jmeno == null ? "Beze jména" : this.jmeno));
		System.out.println("Žije v èesku: " + (this.zijeVCesku ? "Ano" : "Ne"));
	}

	public Period zjistiVek() {
		return Period.between(datumNarozeni, LocalDate.now());
	}
	
	public List<Integer> getHodinyKrmeni() {
		return hodinyKrmeni;
	}

	public void setHodinyKrmeni(List<Integer> hodinyKrmeni) {
		this.hodinyKrmeni = hodinyKrmeni;
	}

	public int getPocetKrmeniZaDen() {
		return pocetKrmeniZaDen;
	}

	public void setPocetKrmeniZaDen(int pocetKrmeniZaDen) {
		this.pocetKrmeniZaDen = pocetKrmeniZaDen;
	}

	public LocalDate getDatumNarozeni() {
		return datumNarozeni;
	}

	public String getJmeno() {
		return jmeno;
	}

	public boolean isZijeVCesku() {
		return zijeVCesku;
	}
	
	
}
