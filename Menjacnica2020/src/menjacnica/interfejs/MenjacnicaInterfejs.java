package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {
	
	public void dodajKurs(Kurs k);
	
	public void obrisiKurs(Kurs k);
	
	public Kurs pronadjiKurs(GregorianCalendar datum);

}
