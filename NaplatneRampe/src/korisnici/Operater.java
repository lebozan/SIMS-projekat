package korisnici;

import rampe.NaplatnaRampa;
import rampe.Vozilo;

public class Operater extends Korisnik {
	private NaplatnaRampa radnoMesto;
	
	Operater(){
	}
	
	Operater(Operater o){
		this.username = o.getUsername();
		this.password = o.getPassword();
		this.ime = o.getIme();
		this.prezime = o.getPrezime();
		this.uloga = UlogaKorisnika.OPERATER;
		this.radnoMesto = o.getRadnoMesto();
	}
	
	Operater(String un, String pw, String ime, String prz,NaplatnaRampa rampa){
		this.username = un;
		this.password = pw;
		this.ime = ime;
		this.prezime = prz;
		this.uloga = UlogaKorisnika.OPERATER;
		this.radnoMesto = rampa;
	}

	public NaplatnaRampa getRadnoMesto() {
		return radnoMesto;
	}

	public void setRadnoMesto(NaplatnaRampa radnoMesto) {
		this.radnoMesto = radnoMesto;
	}

	public void NaplataPutarine(Vozilo v) {
		
	}
	
	public void DizanjeRampe() {
		
	}
	
	public void PrijavaGreske() {
		
	}
}
