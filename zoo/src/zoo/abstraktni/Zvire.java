package zoo.abstraktni;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Zvire {

	private LocalDate datumNarozeni;
	private List<Integer> hodinyKrmeni;
	private int pocetKrmeniZaDen; // nestačilo by hodinyKrmeni.size(); ?
	private String jmeno;
	private boolean zijeVCesku;
	
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM YYYY");
	
	public Zvire(LocalDate datumNarozeni, String jmeno, boolean zijeVCesku) {
		this.datumNarozeni = datumNarozeni;
		this.jmeno = jmeno;
		this.zijeVCesku = zijeVCesku;
	}
	
	public void vypisInformace() {
		System.out.println("Datum narození: " + datumNarozeni.format(formatter));
		System.out.println("Počet hodin krmení za den: " + this.pocetKrmeniZaDen);
		// rychlé předělání čísel do Stringu, miluji javu 8
		System.out.println("Časy krmení: " + String.join(", ", hodinyKrmeni.stream().map(e -> {
			return String.valueOf(e);
		}).collect(Collectors.toList())));
		System.out.println("Jméno: " + this.jmeno);
		System.out.println("Žije v česku: " + (this.zijeVCesku ? "Ano" : "Ne"));
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
