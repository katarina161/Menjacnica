package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
	
	private GregorianCalendar datum;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	
	public GregorianCalendar getDatum() {
		return datum;
	}
	
	public void setDatum(GregorianCalendar datum) {
		if(datum == null)
			throw new RuntimeException("Datum ne sme biti null");
		
		this.datum = datum;
	}
	
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	
	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs < 0)
			throw new RuntimeException("Vrednost prodajnog kursa mora biti pozitivna vrednost");
		
		this.prodajniKurs = prodajniKurs;
	}
	
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	
	public void setKupovniKurs(double kupovniKurs) {
		if(prodajniKurs < 0)
			throw new RuntimeException("Vrednost kupovnog kursa mora biti pozitivna vrednost");
		
		this.kupovniKurs = kupovniKurs;
	}
	
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	
	public void setSrednjiKurs(double srednjiKurs) {
		if(prodajniKurs < 0)
			throw new RuntimeException("Vrednost srednjeg kursa mora biti pozitivna vrednost");
		
		this.srednjiKurs = srednjiKurs;
	}
	
	@Override
	public String toString() {
		return "Kurs [datum=" + datum + ", prodajniKurs=" + prodajniKurs + ", kupovniKurs=" + kupovniKurs
				+ ", srednjiKurs=" + srednjiKurs + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
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
		Kurs other = (Kurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		return true;
	}
	
	

}
