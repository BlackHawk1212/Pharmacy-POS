package view.appHome;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginController {
    private Stage stage;

    @FXML
    private Button closeButton;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private void closeStage(ActionEvent actionEvent){
        stage = (Stage) anchorPane.getScene().getWindow();
        stage.close();
    }
}
