package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs_menjacnice.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodajKursValuteNaDan(String oznakaValute, GregorianCalendar datum, double prodajniKurs, 
			double srednjiKurs,	double kupovniKurs) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getOznakaValute().equals(oznakaValute)){
				Kurs k = new Kurs();
				
				k.setDatum(datum);
				k.setProdajniKurs(prodajniKurs);
				k.setSrednjiKurs(srednjiKurs);
				k.setKupovniKurs(kupovniKurs);
				
				valute.get(i).getKursevi().add(k);
			}
				
		}
	}

	@Override
	public void obrisiKursValuteNaDan(String oznakaValute, GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public double pronadjiIVratiKursValuteNaDan(String oznakaValute, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return 0;
	}

}
