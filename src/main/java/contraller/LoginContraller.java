package contraller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class LoginContraller {
    public TextField txtUserName;
    public TextField txtPassword;

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


    }
}
