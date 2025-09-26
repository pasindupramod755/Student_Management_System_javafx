package contraller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginContraller {
    public TextField txtUserName;
    public TextField txtPassword;

    Stage stage = new Stage();
    public void btnLoginAction(ActionEvent e) {
        String userName = "pasindu";
        String password = "12345";

        if (txtUserName.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Login Warning");
            alert.setHeaderText(null);
            alert.setContentText(" ⚠ Please enter your Username!");
            alert.showAndWait();
            return;
        }
        if (txtPassword.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Login Warning");
            alert.setHeaderText(null);
            alert.setContentText(" ⚠ Please enter your Password!");
            alert.showAndWait();
            return;
        }
        if (!userName.equals(txtUserName.getText()) || !password.equals(txtPassword.getText())){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Login Warning");
            alert.setHeaderText(null);
            alert.setContentText(" ⚠ Username or Password incorrect!");
            alert.showAndWait();
            return;
        }
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/template/home_form.fxml"))));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        stage.show();


    }
}
