package contraller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeContraller {
    Stage stage = new Stage();
    public void btnStudentManagementAction(ActionEvent e) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/template/student_management.fxml"))));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        stage.show();
    }
}
