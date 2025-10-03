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

    public void btnBatchManagementAction(ActionEvent actionEvent) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/template/batch_management.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();

    }

    public void btnGradeManagementAction(ActionEvent actionEvent) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/template/grade_management.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    public void btnReportManagementAction(ActionEvent actionEvent) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/template/report_management.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();

    }
}
