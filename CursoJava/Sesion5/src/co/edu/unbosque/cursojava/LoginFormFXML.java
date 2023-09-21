package co.edu.unbosque.cursojava;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginFormFXML extends Application {

	@FXML
	private Text actiontarget;

	@FXML
	protected void handleSubmitButtonAction(ActionEvent event) {
		actiontarget.setText("Sign in button pressed");
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));

		Scene scene = new Scene(root, 300, 275);

		primaryStage.setTitle("FXML Welcome");
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}