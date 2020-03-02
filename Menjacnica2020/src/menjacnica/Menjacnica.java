package menjacnica;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private List<Valuta> valute = new ArrayList<Valuta>();
	
	public List<Valuta> getValute() {
		return valute;
	}

	@Override
	public void dodajKurs(String valuta, Kurs k) {
		if(k == null || valuta == null)
			throw new RuntimeException("Valuta ili kurs ne mogu biti null");
		
		for(Valuta v: valute)
			if(v.getOznakaValute().equals(valuta))
				v.getKursevi().add(k);
	}

	@Override
	public void obrisiKurs(String valuta, Kurs k) {
		if(k == null || valuta == null)
			throw new RuntimeException("Valuta ili kurs ne mogu biti null");
		
		for(Valuta v: valute)
			if(v.getOznakaValute().equals(valuta))
				v.getKursevi().remove(k);
	}

	@Override
	public Kurs pronadjiKurs(String valuta, GregorianCalendar datum) {
		if(datum == null || valuta == null)
			throw new RuntimeException("Datum ili kurs ne mogu biti null");
		
		for(Valuta v: valute) {
			if(v.getOznakaValute().equals(valuta)) {
				for(Kurs k: v.getKursevi())
					if(k.getDatum().equals(datum))
						return k;
			}
		}
		
		return null;
	}

}
