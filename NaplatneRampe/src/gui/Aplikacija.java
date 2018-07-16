package gui;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import korisnici.Administrator;
import korisnici.Korisnik;
import korisnici.Operater;
import korisnici.SefCentrale;
import korisnici.SefStanice;

public class Aplikacija extends Application{
	
	Stage prozor;
	GridPane sadrzaj;
	LogInProzor login;
	Korisnik trenutniKorisnik;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		prozor = primaryStage;
		prozor.setTitle("Aplikacija");
		sadrzaj = new GridPane();
		
		Scene okvir = new Scene(sadrzaj, 600, 500);
		login = new LogInProzor();
		prozor.setScene(okvir);
		prozor.show();
		
		login.setRoditelj(this);
		login.setAlwaysOnTop(true);
		prozor.setOnCloseRequest(e -> Platform.exit());
		
	}
	
	public void postaviTrenutnogKorisnika(String uname,String pword, String ime, String prezime, int uloga) {
		switch (uloga) {
			case 0: trenutniKorisnik = new Administrator(uname, pword, ime, prezime);
					
					adminMeni(sadrzaj);
					login.close();
					break;
			case 1: trenutniKorisnik = new SefCentrale(uname, pword, ime, prezime);
					sefCentraleMeni(sadrzaj);
					login.close();
					break;
			case 2: trenutniKorisnik = new SefStanice(uname, pword, ime, prezime);
					sefStaniceMeni(sadrzaj);
					login.close();
					break;
			case 3: trenutniKorisnik = new Operater(uname, pword, ime, prezime);
					operatorStaniceMeni(sadrzaj);
					login.close();
					break;	
		}
		
	}
	
	private void adminMeni(GridPane layout) {
		Button b1 = new Button("Unos korisnika");
		b1.setPrefSize(110, 110);
		Button b2 = new Button("Unos centrale");
		b2.setPrefSize(110, 110);
		Button b3 = new Button("Unos stanice");
		b3.setPrefSize(110, 110);
		Button b4 = new Button("Izmena korisnika");
		b4.setPrefSize(110, 110);
		Button b5 = new Button("Izmena centrale");
		b5.setPrefSize(110, 110);
		Button b6 = new Button("Izmena stanice");
		b6.setPrefSize(110, 110);
		
		layout.setAlignment(Pos.CENTER);
		layout.setHgap(30);
		layout.setVgap(20);
		layout.add(b1, 0, 1);
		layout.add(b2, 0, 2);
		layout.add(b3, 0, 3);
		layout.add(b4, 1, 1);
		layout.add(b5, 1, 2);
		layout.add(b6, 1, 3);
	}
	
	private void sefCentraleMeni(GridPane layout) {
		Button b1 = new Button("Izvestaj broja vozila stanice za datum");
		b1.setWrapText(true);
		b1.setPrefSize(110, 110);
		Button b2 = new Button("Izvestaj broja vozila stanice za period");
		b2.setWrapText(true);
		b2.setPrefSize(110, 110);
		Button b3 = new Button("Izvestaj ukupne zarade stanice za datum");
		b3.setWrapText(true);
		b3.setPrefSize(110, 110);
		Button b4 = new Button("Izvestaj ukupne zarade stanice za period");
		b4.setWrapText(true);
		b4.setPrefSize(110, 110);
		Button b5 = new Button("Izvestaj broja vozila centrale za datum");
		b5.setWrapText(true);
		b5.setPrefSize(110, 110);
		Button b6 = new Button("Izvestaj broja vozila centrale za period");
		b6.setWrapText(true);
		b6.setPrefSize(110, 110);
		Button b7 = new Button("Izvestaj ukupne zarade centrale za datum");
		b7.setWrapText(true);
		b7.setPrefSize(110, 110);
		Button b8 = new Button("Izvestaj ukupne zarade centrale za period");
		b8.setWrapText(true);
		b8.setPrefSize(110, 110);
		
		layout.setAlignment(Pos.CENTER);
		layout.setHgap(30);
		layout.setVgap(20);
		layout.add(new Label("Izvestaji stanice"), 0, 0);
		layout.add(new Label("Izvestaji centrale"), 1, 0);
		layout.add(b1, 0, 1);
		layout.add(b2, 0, 2);
		layout.add(b3, 0, 3);
		layout.add(b4, 0, 4);
		layout.add(b5, 1, 1);
		layout.add(b6, 1, 2);
		layout.add(b7, 1, 3);
		layout.add(b8, 1, 4);
	}
	
	private void sefStaniceMeni(GridPane layout) {
		Button b1 = new Button("Izvestaj broja vozila stanice za datum");
		b1.setWrapText(true);
		b1.setPrefSize(110, 110);
		Button b2 = new Button("Izvestaj broja vozila stanice za period");
		b2.setWrapText(true);
		b2.setPrefSize(110, 110);
		Button b3 = new Button("Izvestaj ukupne zarade stanice za datum");
		b3.setWrapText(true);
		b3.setPrefSize(110, 110);
		Button b4 = new Button("Izvestaj ukupne zarade stanice za period");
		b4.setWrapText(true);
		b4.setPrefSize(110, 110);
		Button b5 = new Button("Promena cene deonice");
		b5.setWrapText(true);
		b5.setPrefSize(110, 110);
		
		layout.setAlignment(Pos.CENTER);
		layout.setHgap(30);
		layout.setVgap(20);
		layout.add(b1, 0, 1);
		layout.add(b2, 0, 2);
		layout.add(b3, 1, 1);
		layout.add(b4, 1, 2);
		layout.add(b5, 2, 1);

	}
	
	private void operatorStaniceMeni(GridPane layout) {
		Button b1 = new Button("Naplata putarine");
		b1.setWrapText(true);
		b1.setPrefSize(110, 110);
		Button b2 = new Button("Dizanje rampe");
		b2.setWrapText(true);
		b2.setPrefSize(110, 110);
		Button b3 = new Button("Prijava greske");
		b3.setWrapText(true);
		b3.setPrefSize(110, 110);
		
		layout.setAlignment(Pos.CENTER);
		layout.setHgap(30);
		layout.setVgap(20);
		layout.add(b1, 0, 1);
		layout.add(b2, 1, 1);
		layout.add(b3, 2, 1);
	}
	
}
