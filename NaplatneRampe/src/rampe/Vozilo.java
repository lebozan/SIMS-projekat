package rampe;

public class Vozilo {
	private String Kategorija;
	private String UlaznaRampa;
	private String RegTablica;
	
	Vozilo(){
	}
	
	Vozilo(String kategorija, String ulaznaRampa, String regTablica) {
		this.Kategorija = kategorija;
		this.UlaznaRampa = ulaznaRampa;
		this.RegTablica = regTablica;
	}

	Vozilo(Vozilo v){
		this.Kategorija = getKategorija();
		this.UlaznaRampa = getUlaznaRampa();
		this.RegTablica = getRegTablica();
	}
	
	public String getKategorija() {
		return Kategorija;
	}

	public void setKategorija(String kategorija) {
		Kategorija = kategorija;
	}

	public String getUlaznaRampa() {
		return UlaznaRampa;
	}

	public void setUlaznaRampa(String ulaznaRampa) {
		UlaznaRampa = ulaznaRampa;
	}

	public String getRegTablica() {
		return RegTablica;
	}

	public void setRegTablica(String regTablica) {
		RegTablica = regTablica;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vozilo other = (Vozilo) obj;
		if (Kategorija == null) {
			if (other.Kategorija != null)
				return false;
		} else if (!Kategorija.equals(other.Kategorija))
			return false;
		if (RegTablica == null) {
			if (other.RegTablica != null)
				return false;
		} else if (!RegTablica.equals(other.RegTablica))
			return false;
		if (UlaznaRampa == null) {
			if (other.UlaznaRampa != null)
				return false;
		} else if (!UlaznaRampa.equals(other.UlaznaRampa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vozilo: [Kategorija=" + Kategorija + ", UlaznaRampa=" + UlaznaRampa + ", RegTablica=" + RegTablica + "]";
	}
	
	
}
