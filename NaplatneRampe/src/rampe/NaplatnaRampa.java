package rampe;

public class NaplatnaRampa {
	private String naziv;
	private int K1cena;
	private int K2cena;
	private int K3cena;
	private int K4cena;
	private int K5cena;
	private boolean Aktivna;
	
	NaplatnaRampa(){
	}
	
	NaplatnaRampa(NaplatnaRampa nr){
		this.naziv = nr.getNaziv();
		this.K1cena = nr.getK1cena();
		this.K2cena = nr.getK2cena();
		this.K3cena = nr.getK3cena();
		this.K4cena = nr.getK4cena();
		this.K5cena = nr.getK5cena();
		this.Aktivna = nr.isAktivna();
	}
	
	NaplatnaRampa(String naziv,int k1,int k2,int k3,int k4,int k5,boolean akt){
		this.naziv = naziv;
		this.K1cena = k1;
		this.K2cena = k2;
		this.K3cena = k3;
		this.K4cena = k4;
		this.K5cena = k5;
		this.Aktivna = akt;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getK1cena() {
		return K1cena;
	}
	public void setK1cena(int k1cena) {
		K1cena = k1cena;
	}
	public int getK2cena() {
		return K2cena;
	}
	public void setK2cena(int k2cena) {
		K2cena = k2cena;
	}
	public int getK3cena() {
		return K3cena;
	}
	public void setK3cena(int k3cena) {
		K3cena = k3cena;
	}
	public int getK4cena() {
		return K4cena;
	}
	public void setK4cena(int k4cena) {
		K4cena = k4cena;
	}
	public int getK5cena() {
		return K5cena;
	}
	public void setK5cena(int k5cena) {
		K5cena = k5cena;
	}
	public boolean isAktivna() {
		return Aktivna;
	}
	public void setAktivna(boolean aktivna) {
		Aktivna = aktivna;
	}

	@Override
	public String toString() {
		return "Naplatna Rampa: [naziv=" + naziv + ", K1cena=" + K1cena + ", K2cena=" + K2cena + ", K3cena=" + K3cena
				+ ", K4cena=" + K4cena + ", K5cena=" + K5cena + ", Aktivna=" + Aktivna + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NaplatnaRampa other = (NaplatnaRampa) obj;
		if (Aktivna != other.Aktivna)
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
