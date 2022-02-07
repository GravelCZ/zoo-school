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
	private int pocetKrmeniZaDen; // nestačilo by hodinyKrmeni.size(); ?
	protected String jmeno;
	private boolean zijeVCesku;
	
	protected static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM YYYY");
	
	public Zvire(LocalDate datumNarozeni, String jmeno, boolean zijeVCesku) {
		this.datumNarozeni = datumNarozeni;
		this.jmeno = jmeno;
		this.zijeVCesku = zijeVCesku;
	}
	
	public void vypisInformace() {
		System.out.println("Datum narozen�: " + (datumNarozeni == null ? "nedefinov�no" : datumNarozeni.format(formatter)));	
		System.out.println("Po�et hodin krmen� za den: " + this.pocetKrmeniZaDen);
		// rychl� p�ed�l�n� ��sel do Stringu, miluji javu 8
		if (!hodinyKrmeni.isEmpty()) {
			System.out.println("�asy krmen�: " + String.join(", ", hodinyKrmeni.stream().map(e -> {
				return String.valueOf(e);
			}).collect(Collectors.toList())));	
		}
		System.out.println("Jm�no: " + (this.jmeno == null ? "Beze jm�na" : this.jmeno));
		System.out.println("�ije v �esku: " + (this.zijeVCesku ? "Ano" : "Ne"));
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
