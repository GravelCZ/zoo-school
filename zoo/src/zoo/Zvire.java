package zoo;

import java.time.LocalDate;
import java.util.List;

public abstract class Zvire {

	private LocalDate datumNarozeni;
	private List<Integer> hodinyKrmeni;
	private int pocetKrmeniZaDen; // nestačilo by hodinyKrmeni.size(); ?
	private String jmeno;
	private boolean zijeVCesku;
	
	public Zvire(LocalDate datumNarozeni, String jmeno, boolean zijeVCesku) {
		this.datumNarozeni = datumNarozeni;
		this.jmeno = jmeno;
		this.zijeVCesku = zijeVCesku;
	}
	
	public void vypisInformace() {
		
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
