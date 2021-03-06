package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Recept implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int sifra;
	private String idLekara;
	private String jmbgPacijenta;
	private Map<Lek,Integer> lekovi;
	private float ukupnaCena;
	private LocalDateTime datum;
	private boolean obrisan;
	
	public Recept() {
		lekovi = new HashMap<>();
		obrisan = false;
	}
	
	public Recept(int sifra, String idLekara, String jmbgPacijenta, Map<Lek,Integer> lekovi, float ukupnaCena, LocalDateTime datum) {
		this.sifra = sifra;
		this.idLekara = idLekara;
		this.jmbgPacijenta = jmbgPacijenta;
		this.lekovi = lekovi;
		this.ukupnaCena = ukupnaCena;
		this.datum = datum;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public String getIdLekara() {
		return idLekara;
	}

	public void setIdLekara(String idLekara) {
		this.idLekara = idLekara;
	}

	public String getJmbgPacijenta() {
		return jmbgPacijenta;
	}

	public void setJmbgPacijenta(String jmbgPacijenta) {
		this.jmbgPacijenta = jmbgPacijenta;
	}

	public Map<Lek, Integer> getLekovi() {
		return lekovi;
	}

	public void setLekovi(Map<Lek, Integer> lekovi) {
		this.lekovi = lekovi;
	}

	public float getUkupnaCena() {
		return ukupnaCena;
	}

	public void setUkupnaCena(float ukupnaCena) {
		this.ukupnaCena = ukupnaCena;
	}

	public LocalDateTime getDatum() {
		return datum;
	}

	public void setDatum(LocalDateTime datum) {
		this.datum = datum;
	}

	public boolean isObrisan() {
		return obrisan;
	}

	public void setObrisan(boolean obrisan) {
		this.obrisan = obrisan;
	}

}
