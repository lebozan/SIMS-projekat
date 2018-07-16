package gui;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javafx.application.Platform;
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

public class LogInProzor extends Stage implements EventHandler<ActionEvent>{
	
	private Aplikacija roditelj;
	public boolean uspesanLogin;
	private Button btnSignIn;
	private Button btnExit;
	private TextField unField;
	private PasswordField pwField;
	private final Text loginMsg = new Text();

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

        unField = new TextField();
        grid.add(unField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        pwField = new PasswordField();
        grid.add(pwField, 1, 2);
        
        btnSignIn = new Button("Sign in");
        btnSignIn.setOnAction(this::handle);
        HBox hb = new HBox(10);
        hb.setAlignment(Pos.BOTTOM_RIGHT);
        hb.getChildren().add(btnSignIn);
        btnExit = new Button("Exit");
        btnExit.setOnAction(this::handle);
        hb.getChildren().add(btnExit);
        grid.add(hb, 1, 4);
        
        grid.add(loginMsg, 1, 6);
        
//        btn.setOnAction(e -> {
//        	
//        });
        
//        this.setOnCloseRequest(e -> Platform.exit());

        Scene scene = new Scene(grid, 300, 275);
        this.setScene(scene);
//        this.initModality(Modality.APPLICATION_MODAL);
        this.show();
	}

	public LogInProzor(StageStyle style) {
		super(style);
		// TODO Auto-generated constructor stub
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
					roditelj.postaviTrenutnogKorisnika(tokens[0], tokens[1], tokens[2], tokens[3], Integer.parseInt(tokens[4]));
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
	
	public Aplikacija getRoditelj() {
		return roditelj;
	}

	public void setRoditelj(Aplikacija roditelj) {
		this.roditelj = roditelj;
	}

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource().equals(btnSignIn)) {
			boolean potvrda = proveriLogin(unField.getText(), pwField.getText());
	    	if (potvrda) {
	    		loginMsg.setFill(Color.LIMEGREEN);
	    		loginMsg.setText("Uspesno ste se ulogovali!");
	    		
//	    		uspesanLogin = true;
//	    		AlertProzor.display("Uspesan login", "Ulogovani ste kao korisnik " + userTextField.getText());
	    	} else {
	    		loginMsg.setFill(Color.FIREBRICK);
	    		loginMsg.setText("Neuspesan login!\nProbajte ponovo");
//	    		uspesanLogin = false;
//	    		AlertProzor.display("Neuspesan login", "Probajte ponovo");
	    	}
//	    	zatvori();
		} else if (event.getSource().equals(btnExit)) {
			Platform.exit();
			this.close();
		}
		
	}
	

}
