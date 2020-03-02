package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {
	
	public void dodajKurs(String valuta, Kurs k);
	
	public void obrisiKurs(String valuta, Kurs k);
	
	public Kurs pronadjiKurs(String valuta, GregorianCalendar datum);

}
