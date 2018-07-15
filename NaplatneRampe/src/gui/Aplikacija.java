package gui;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.System;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import korisnici.Korisnik;

public class Aplikacija extends Application{
	
	Button b;
	LogInProzor login;
	Korisnik trenutniKorisnik;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		primaryStage.setTitle("Aplikacija");
		b = new Button();
		b.setText("klikni me pls");
		login = new LogInProzor();
//		System.out.println(login.getUlogovan().getUsername());
		StackPane layout = new StackPane();
		layout.getChildren().add(b);
		
		Scene s = new Scene(layout, 1000, 600);
		primaryStage.setScene(s);
		primaryStage.show();
		login.toFront();
		
	}
	
}
