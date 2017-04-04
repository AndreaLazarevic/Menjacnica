package menjacnica;

import java.util.LinkedList;

public class Valuta {
	private String nazivValute;
	private String oznakaValute;
	private LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
	
	public String getNazivValute() {
		return nazivValute;
	}
	
	public void setNazivValute(String nazivValute) {
		this.nazivValute = nazivValute;
	}
	
	public String getOznakaValute() {
		return oznakaValute;
	}
	
	public void setOznakaValute(String oznakaValute) {
		this.oznakaValute = oznakaValute;
	}
	
	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}

	public void setKursevi(LinkedList<Kurs> kursevi) {
		this.kursevi = kursevi;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result
				+ ((nazivValute == null) ? 0 : nazivValute.hashCode());
		result = prime * result
				+ ((oznakaValute == null) ? 0 : oznakaValute.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object o) {
		
		if (o instanceof Valuta){
			Valuta v = (Valuta) o;
			
			if (oznakaValute.equals(v.oznakaValute))
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Naziv valute:" + nazivValute + ", oznaka valute: " + oznakaValute + ", kursevi: " + kursevi;
	}
}
