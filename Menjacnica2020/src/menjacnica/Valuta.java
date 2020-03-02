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
	public String toString() {
		return "Valuta [nazivValute=" + nazivValute + ", oznakaValute=" + oznakaValute + ", kursevi=" + kursevi + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((oznakaValute == null) ? 0 : oznakaValute.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (oznakaValute == null) {
			if (other.oznakaValute != null)
				return false;
		} else if (!oznakaValute.equals(other.oznakaValute))
			return false;
		return true;
	}
	

}
