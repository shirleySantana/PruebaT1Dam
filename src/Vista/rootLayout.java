package Vista;

import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import Controlador.Main;

public class rootLayout {
	  // Reference to the main application
    private Main main;


    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    private void handleExit() {
        System.exit(0);
    }
   
}
