package rampe;

import java.util.Map;

public class NaplatnaStanica {
	private String naziv;
	private Map<String, Integer> K1cena;
	private Map<String, Integer> K2cena;
	private Map<String, Integer> K3cena;
	private Map<String, Integer> K4cena;
	private Map<String, Integer> K5cena;
	private boolean aktivna;
	
	public NaplatnaStanica(){
	}
	
	public NaplatnaStanica(NaplatnaStanica nr){
		this.naziv = nr.getNaziv();
		this.K1cena = nr.getK1cena();
		this.K2cena = nr.getK2cena();
		this.K3cena = nr.getK3cena();
		this.K4cena = nr.getK4cena();
		this.K5cena = nr.getK5cena();
		this.aktivna = nr.isAktivna();
	}
	
	
	
	public NaplatnaStanica(String naziv, Map<String, Integer> k1cena, Map<String, Integer> k2cena,
			Map<String, Integer> k3cena, Map<String, Integer> k4cena, Map<String, Integer> k5cena, boolean aktivna) {
		super();
		this.naziv = naziv;
		K1cena = k1cena;
		K2cena = k2cena;
		K3cena = k3cena;
		K4cena = k4cena;
		K5cena = k5cena;
		this.aktivna = aktivna;
	}

	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public Map<String, Integer> getK1cena() {
		return K1cena;
	}

	public void setK1cena(Map<String, Integer> k1cena) {
		K1cena = k1cena;
	}

	public Map<String, Integer> getK2cena() {
		return K2cena;
	}

	public void setK2cena(Map<String, Integer> k2cena) {
		K2cena = k2cena;
	}

	public Map<String, Integer> getK3cena() {
		return K3cena;
	}

	public void setK3cena(Map<String, Integer> k3cena) {
		K3cena = k3cena;
	}

	public Map<String, Integer> getK4cena() {
		return K4cena;
	}

	public void setK4cena(Map<String, Integer> k4cena) {
		K4cena = k4cena;
	}

	public Map<String, Integer> getK5cena() {
		return K5cena;
	}

	public void setK5cena(Map<String, Integer> k5cena) {
		K5cena = k5cena;
	}

	public boolean isAktivna() {
		return aktivna;
	}

	public void setAktivna(boolean aktivna) {
		this.aktivna = aktivna;
	}

	@Override
	public String toString() {
		return "Naplatna Rampa: [naziv=" + naziv + ", K1cena=" + K1cena + ", K2cena=" + K2cena + ", K3cena=" + K3cena
				+ ", K4cena=" + K4cena + ", K5cena=" + K5cena + ", Aktivna=" + aktivna + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NaplatnaStanica other = (NaplatnaStanica) obj;
		if (aktivna != other.aktivna)
			return false;
		if (K1cena != other.K1cena)
			return false;
		if (K2cena != other.K2cena)
			return false;
		if (K3cena != other.K3cena)
			return false;
		if (K4cena != other.K4cena)
			return false;
		if (K5cena != other.K5cena)
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		return true;
	}
	
}
