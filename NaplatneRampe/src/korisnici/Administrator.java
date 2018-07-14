package korisnici;

import rampe.NaplatnaRampa;

public class Administrator extends Korisnik {
	
	Administrator(){
	}
	
	Administrator(Korisnik a){
		this.username = a.getUsername();
		this.password = a.getPassword();
		this.ime = a.getIme();
		this.prezime = a.getPrezime();
		this.uloga = UlogaKorisnika.ADMINISTRATOR;
		
	}
	
	Administrator(String un, String pw, String ime, String prz){
		this.username = un;
		this.password = pw;
		this.ime = ime;
		this.prezime = prz;
		this.uloga = UlogaKorisnika.ADMINISTRATOR;
	}
	
	public void UnesiKorisnika(){
		
	}
	
	public void UnesiStanicu() {
		
	}
	
	public void UnesiCentralu() {
		
	}
	
	public void IzmeniKorisnika(Korisnik k) {
		
	}
	
	public void IzmeniStanicu(NaplatnaRampa nr) {
		
	}
	
}