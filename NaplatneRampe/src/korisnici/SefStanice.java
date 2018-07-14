package korisnici;

import java.util.Date;
import rampe.NaplatnaRampa;

public class SefStanice extends Korisnik{
	private NaplatnaRampa rampa;
	
	SefStanice(){
	}

	SefStanice(String un, String pw, String ime, String prz,NaplatnaRampa rampa) {
		this.username = un;
		this.password = pw;
		this.ime = ime;
		this.prezime = prz;
		this.uloga = UlogaKorisnika.SEFSTANICE;
		this.rampa = rampa;
	}
	
	SefStanice(SefStanice ss){
		this.username = ss.getUsername();
		this.password = ss.getPassword();
		this.ime = ss.getIme();
		this.prezime = ss.getPrezime();
		this.rampa = ss.getRampa();
		this.uloga = UlogaKorisnika.SEFSTANICE;
	}

	public NaplatnaRampa getRampa() {
		return rampa;
	}

	public void setRampa(NaplatnaRampa rampa) {
		this.rampa = rampa;
	}
	
	public void ZaradaPoDatumuJedna(Date datum) {
		
	}
	
	public void ZaradaUPerioduJedna(Date dat1, Date dat2) {
		
	}
}
