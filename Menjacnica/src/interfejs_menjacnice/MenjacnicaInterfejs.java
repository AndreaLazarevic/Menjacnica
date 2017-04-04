package interfejs_menjacnice;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {
	public void dodajKursValuteNaDan(String oznakaValute, GregorianCalendar datum, double prodajniKurs, double srednjiKurs, double kupovniKurs);
	public void obrisiKursValuteNaDan(String oznakaValute, GregorianCalendar datum);
	public double pronadjiIVratiKursValuteNaDan(String oznakaValute, GregorianCalendar datum);
}
