package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private AnchorPane rootLayout;
	private Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("My first gallery");
			this.primaryStage.setX(200);
			this.primaryStage.setY(250);
			primaryStage.show();
			initRootLayout();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void initRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/DesignGallery.fxml"));
			rootLayout = (AnchorPane) loader.load();
			//show the scene containing the root layout
			Scene scene = new Scene(rootLayout,640,480);
			//scene.getStylesheets().add(
				//getClass().getResource("application.css").toExternalForm());
			//scene.getStylesheets().add("http://fonts.googleapis.com/css?family=Shadows+Into+Light");
			primaryStage.setScene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
