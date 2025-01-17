package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GamePlayScene {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void toPlayMenuScene(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("view/PlayMenu.fxml"));
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}
	
	public void startGame(ActionEvent event) throws Exception {
		// stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		//GameStart game = new GameStart();
		//game.start(stage);
		root = FXMLLoader.load(getClass().getResource("view/GameStart.fxml"));
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}
	
	

}
