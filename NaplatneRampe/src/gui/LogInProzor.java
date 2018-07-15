package gui;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import korisnici.Administrator;
import korisnici.Korisnik;
import korisnici.Operater;
import korisnici.SefCentrale;
import korisnici.SefStanice;
import korisnici.UlogaKorisnika;

public class LogInProzor extends Stage {
	
	private Korisnik ulogovan;

	public LogInProzor() {
		super();
		// TODO Auto-generated constructor stub
		
		GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
//        boolean uspesanLogin;
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
            	boolean potvrda = proveriLogin(userTextField.getText(), pwBox.getText());
            	
            	if (potvrda) {
//            		uspesanLogin = potvrda;
            		actiontarget.setFill(Color.LIMEGREEN);
            		actiontarget.setText("Uspesno ste se ulogovali!");
            	} else {
            		actiontarget.setFill(Color.FIREBRICK);
            		actiontarget.setText("Neuspesan login!\nProbajte ponovo");
            	}
                                
            }
        });

        Scene scene = new Scene(grid, 300, 275);
        this.setScene(scene);
        this.show();
	}

	public LogInProzor(StageStyle style) {
		super(style);
		// TODO Auto-generated constructor stub
	}
	
	public void postaviTrenutnogKorisnika(String uname,String pword, String ime, String prezime, int uloga) {
		switch (uloga) {
			case 0: ulogovan = new Administrator(uname, pword, ime, prezime);
					break;
			case 1: ulogovan = new SefCentrale(uname, pword, ime, prezime);
					break;
			case 2: ulogovan = new SefStanice(uname, pword, ime, prezime);
					break;
			case 3: ulogovan = new Operater(uname, pword, ime, prezime);
					break;
				
		}
	}
	
	private boolean proveriLogin(String un, String pw) {
		
		String basePath = System.getProperty("user.dir");
		String separator = System.getProperty("file.separator");
		String path = basePath + separator + "Fajlovi" + separator + "Korisnici";
		boolean retval = false;
		try {
			FileInputStream is = new FileInputStream(path);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String line;
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split("[|]");
				if (tokens[0].equals(un) && tokens[1].equals(pw)) {
					retval = true;
					postaviTrenutnogKorisnika(tokens[0], tokens[1], tokens[2], tokens[3], Integer.parseInt(tokens[4]));
					break;
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return retval;
	}

	public Korisnik getUlogovan() {
		return ulogovan;
	}

	public void setUlogovan(Korisnik ulogovan) {
		this.ulogovan = ulogovan;
	}
	
	

}
