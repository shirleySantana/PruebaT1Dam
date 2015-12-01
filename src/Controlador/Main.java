package Controlador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

	public class Main extends Application {
		
	    private Stage primaryStage;
	    private AnchorPane rootLayout;
		@Override
		public void start(Stage primaryStage) {
			
	        this.primaryStage = primaryStage;
	        this.primaryStage.setTitle("MyGitHub");
	        Scene scene = new Scene(rootLayout, 450, 300);
	        primaryStage.setScene(scene);
	        primaryStage.show();
		}
	        
	    public void initRootLayout() {
			try {
				 FXMLLoader loader = new FXMLLoader();
				 loader.setLocation(Main.class.getResource("MyGitHub.fxml"));
				 rootLayout = (AnchorPane) loader.load();
				 
				 
				Scene scene = new Scene(rootLayout);
				primaryStage.setScene(scene);
				
	            Vista.rootLayout control = loader.getController();
	            control.setMain(this);
	            
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			launch(args);
		}
	}
