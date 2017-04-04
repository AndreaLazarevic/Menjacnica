package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
	private GregorianCalendar datum;
	private double prodajniKurs;
	private double srednjiKurs;
	private double kupovniKurs;
	
	public GregorianCalendar getDatum() {
		return datum;
	}
	
	public void setDatum(GregorianCalendar datum) {
		if(datum == null)
			throw new RuntimeException("Datum ne sme biti null string!");
		this.datum = datum;
	}
	
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	
	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs == 0)
			throw new RuntimeException("Prodajni kurs ne sme biti 0!");
		this.prodajniKurs = prodajniKurs;
	}
	
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	
	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs == 0)
			throw new RuntimeException("Srednji kurs ne sme biti 0!");
		this.srednjiKurs = srednjiKurs;
	}
	
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	
	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs == 0)
			throw new RuntimeException("Kupovni kurs ne sme biti 0!");
		this.kupovniKurs = kupovniKurs;
	}

	
	@Override
	public String toString() {
		return "Datum:" + datum.getTime() + ", prodajni kurs: " + prodajniKurs
				+ ", srednji kurs: " + srednjiKurs + ", kupovni kurs: "
				+ kupovniKurs ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Kurs){
			Kurs k = (Kurs) o;
			
			if (datum.equals(k.datum))
			return true;
		}
		
		return false;
	}
}
