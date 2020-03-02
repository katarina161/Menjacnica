package menjacnica;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private List<Valuta> valute = new ArrayList<Valuta>();

	@Override
	public void dodajKurs(String valuta, Kurs k) {
		for(int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNazivValute().equals(valuta)) {
				for(int j = 0; j < valute.get(i).getKursevi().size(); j++) {
					if(valute.get(i).getKursevi().get(j).equals(k))
						valute.get(i).getKursevi().remove(j);
				}
			}
		}
	}

	@Override
	public void obrisiKurs(String valuta, Kurs k) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs pronadjiKurs(String valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
