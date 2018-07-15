package korisnici;

import rampe.NaplatnaStanica;

public class Administrator extends Korisnik {
	
	public Administrator(){
	}
	
	public Administrator(Korisnik a){
		this.username = a.getUsername();
		this.password = a.getPassword();
		this.ime = a.getIme();
		this.prezime = a.getPrezime();
		this.uloga = UlogaKorisnika.ADMINISTRATOR;
		
	}
	
	public Administrator(String un, String pw, String ime, String prz){
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
	
	public void IzmeniStanicu(NaplatnaStanica nr) {
		
	}
	
}