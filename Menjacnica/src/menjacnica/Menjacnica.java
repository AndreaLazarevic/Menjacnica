package menjacnica;

import java.util.GregorianCalendar;

import interfejs_menjacnice.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	@Override
	public void dodajKursValuteNaDan(String oznakaValute, GregorianCalendar datum, double prodajniKurs, 
			double srednjiKurs,	double kupovniKurs) {
		// TODO Auto-generated method stub

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
