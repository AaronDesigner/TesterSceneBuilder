package vista;

import java.io.IOException;

import clase.MainFX;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlFX {
	private ImageView imageview;
	private MainFX mainfx;
	
	public void setMain(MainFX mainfx){
		this.mainfx = mainfx;
	}
	public void showView(){
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFX.class.getResource("../vista/Send.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Stage sendStage = new Stage();
			sendStage.setTitle("My Profile");
			Scene scene = new Scene(page);
			sendStage.setScene(scene);
			sendStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@FXML
	private void sendStage(){
		showView();
	}
	@FXML
	private void closeStage(){
		System.exit(0);
	}
}
