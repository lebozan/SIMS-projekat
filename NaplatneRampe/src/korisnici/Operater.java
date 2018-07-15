package korisnici;

import rampe.NaplatnaStanica;
import rampe.Vozilo;

public class Operater extends Korisnik {
	private NaplatnaStanica radnoMesto;
	
	public Operater(){
	}
	
	public Operater(Operater o){
		this.username = o.getUsername();
		this.password = o.getPassword();
		this.ime = o.getIme();
		this.prezime = o.getPrezime();
		this.uloga = UlogaKorisnika.OPERATER;
		this.radnoMesto = o.getRadnoMesto();
	}
	
	public Operater(String un, String pw, String ime, String prz){
		this.username = un;
		this.password = pw;
		this.ime = ime;
		this.prezime = prz;
		this.uloga = UlogaKorisnika.OPERATER;
		
	}

	
	public Operater(String un, String pw, String ime, String prz, NaplatnaStanica rampa){
		this.username = un;
		this.password = pw;
		this.ime = ime;
		this.prezime = prz;
		this.uloga = UlogaKorisnika.OPERATER;
		this.radnoMesto = rampa;
	}

	public NaplatnaStanica getRadnoMesto() {
		return radnoMesto;
	}

	public void setRadnoMesto(NaplatnaStanica radnoMesto) {
		this.radnoMesto = radnoMesto;
	}

	public void NaplataPutarine(Vozilo v) {
		
	}
	
	public void DizanjeRampe() {
		
	}
	
	public void PrijavaGreske() {
		
	}
}
