package application.view;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controlls {
	
	private ImageView imageview;
	private Main main;
	
	public void setMain(Main main){
		this.main = main;
	}
	public void showView(){
		//load the fxml file and create a new stage for the popup
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/DesignTesterIntro.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Stage sendStage = new Stage();
			sendStage.setTitle("Captain");
			Scene scene = new Scene(page);
			sendStage.setScene(scene);
			sendStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@FXML
	private void handleSend(){
		showView();
	}
	@FXML
	private void handleClose(){
		System.exit(0);
	}
}