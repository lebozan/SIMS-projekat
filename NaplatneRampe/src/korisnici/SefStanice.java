package korisnici;

import java.util.Date;
import rampe.NaplatnaStanica;

public class SefStanice extends Korisnik{
	private NaplatnaStanica rampa;
	
	public SefStanice(){
	}

	public SefStanice(String un, String pw, String ime, String prz,NaplatnaStanica rampa) {
		this.username = un;
		this.password = pw;
		this.ime = ime;
		this.prezime = prz;
		this.uloga = UlogaKorisnika.SEFSTANICE;
		this.rampa = rampa;
	}
	
	public SefStanice(String un, String pw, String ime, String prz) {
		this.username = un;
		this.password = pw;
		this.ime = ime;
		this.prezime = prz;
		this.uloga = UlogaKorisnika.SEFSTANICE;
	}
	
	public SefStanice(SefStanice ss){
		this.username = ss.getUsername();
		this.password = ss.getPassword();
		this.ime = ss.getIme();
		this.prezime = ss.getPrezime();
		this.rampa = ss.getRampa();
		this.uloga = UlogaKorisnika.SEFSTANICE;
	}

	public NaplatnaStanica getRampa() {
		return rampa;
	}

	public void setRampa(NaplatnaStanica rampa) {
		this.rampa = rampa;
	}
	
	public void ZaradaPoDatumuJedna(Date datum) {
		
	}
	
	public void ZaradaUPerioduJedna(Date dat1, Date dat2) {
		
	}
	
	public void PromenaCene(String odakle,int novaCena) {
		
	}
}
