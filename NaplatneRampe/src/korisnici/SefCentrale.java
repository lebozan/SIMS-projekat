package korisnici;

import java.util.Date;

import rampe.Centrala;

public class SefCentrale extends Korisnik {
	
	private Centrala centrala;
	
	public SefCentrale(){
	}
	
	public SefCentrale(SefCentrale sc){
		this.username = sc.getUsername();
		this.password = sc.getPassword();
		this.ime = sc.getIme();
		this.prezime = sc.getPrezime();
		this.uloga = UlogaKorisnika.SEFCENTRALE;
		this.centrala = sc.getCentrala();
	}
	
	public SefCentrale(String un, String pw, String ime, String prz) {
		this.username = un;
		this.password = pw;
		this.ime = ime;
		this.prezime = prz;
		this.uloga = UlogaKorisnika.SEFCENTRALE;
	}
	
	public SefCentrale(String un, String pw, String ime, String prz,Centrala c) {
		this.username = un;
		this.password = pw;
		this.ime = ime;
		this.prezime = prz;
		this.uloga = UlogaKorisnika.SEFCENTRALE;
		this.centrala = c;
	}

	public Centrala getCentrala() {
		return centrala;
	}

	public void setCentrala(Centrala centrala) {
		this.centrala = centrala;
	}
	
	public void ZaradaPoDatumuJedna(Date datum) {
		
	}
	
	public void ZaradaPoDatumuSve(Date datum) {
		
	}
	
	public void ZaradaUPerioduJedna(Date dat1, Date dat2) {
		
	}

	public void ZaradaUPerioduSve(Date dat1, Date dat2) {
		
	}
}
