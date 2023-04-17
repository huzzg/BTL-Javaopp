package quanlynhansu.main;

import static java.lang.String.valueOf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

public class chucnang implements Initializable {

    public Button close1;
    public Button save;

    @FXML
    public TableView<nhanvien> table;

    @FXML
    public TableColumn<nhanvien, Integer> idColumn;

    @FXML
    public TableColumn<nhanvien, String> nameColumn;

    @FXML
    public TableColumn<nhanvien, String> emailColumn;

    @FXML
    public TableColumn<nhanvien, Integer> ageColumn;

    @FXML
    public TableColumn<nhanvien, String> addressColumn;

    @FXML
    public TableColumn<nhanvien, Integer> workdayColumn;

    @FXML
    public TableColumn<nhanvien, String> sexColumn;

    @FXML
    public TableColumn<nhanvien, String> partColumn;

    @FXML
    public TableColumn<nhanvien, String> positionColumn;

    @FXML
    public TableColumn<nhanvien, Integer> salaryColumn;

    @FXML
    public TextField idText;

    @FXML
    public TextField nameText;

    @FXML
    public TextField emailText;

    @FXML
    public TextField ageText;

    @FXML
    public TextField addressText;

    @FXML
    public TextField workdayText;

    @FXML
    public TextField searchText;

    @FXML
    public ComboBox<String> sexText;

    @FXML
    public ComboBox<String> partText;

    @FXML
    public ComboBox<String> positionText;

    ObservableList<String> sexTextList = FXCollections.observableArrayList("Male", "Female", "Other");
    ObservableList<String> partTextList = FXCollections.observableArrayList("Technology", "Accounting", "Marketing", "Engineering");
    ObservableList<String> positionList = FXCollections.observableArrayList("CEO", "Founder", "Manager", "Director");
    /**
     *
     */
    

    public ObservableList<nhanvien> getNhanvienList() {
        return nhanvienList;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idColumn.setCellValueFactory(new PropertyValueFactory<nhanvien, Integer>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<nhanvien, String>("name"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<nhanvien, String>("email"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<nhanvien, Integer>("age"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<nhanvien, String>("address"));
        workdayColumn.setCellValueFactory(new PropertyValueFactory<nhanvien, Integer>("workday"));
        sexColumn.setCellValueFactory(new PropertyValueFactory<nhanvien, String>("sex"));
        partColumn.setCellValueFactory(new PropertyValueFactory<nhanvien, String>("part"));
        positionColumn.setCellValueFactory(new PropertyValueFactory<nhanvien, String>("position"));
        salaryColumn.setCellValueFactory(new PropertyValueFactory<nhanvien, Integer>("salary"));
        table.setItems(nhanvienList);
        sexText.setItems(sexTextList);
        partText.setItems(partTextList);
        positionText.setItems(positionList);

    }


    /**
     * @param e
     */
    public void sexAction(ActionEvent e) {
    }

    /**
     * @param e
     */
    public void partAction(ActionEvent e) {
    }

    /**
     * @param e
     */
    public void positionAction(ActionEvent e) {
    }

}

public void add(ActionEvent e) {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Xác nhận");
    alert.setHeaderText("Xác nhận thêm nhân viên");
    alert.setContentText("Bạn có muốn thêm nhân viên này không?");
    ButtonType buttonTypeYes = new ButtonType("Yes", ButtonBar.ButtonData.YES);
    ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
    alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeCancel);

    Optional<ButtonType> result = alert.showAndWait();
    if (isValidInput(e)) {
        if (result.get() == buttonTypeYes) {
            nhanvien newNhanvien = new nhanvien();
            newNhanvien.setId(Integer.parseInt(idText.getText()));
            newNhanvien.setName(nameText.getText());
            newNhanvien.setEmail(emailText.getText());
            newNhanvien.setAge(Integer.parseInt(ageText.getText()));
            newNhanvien.setAddress(addressText.getText());
            newNhanvien.setWorkday(Integer.parseInt(workdayText.getText()));
            newNhanvien.setSex(sexText.getValue());
            newNhanvien.setPart(partText.getValue());
            newNhanvien.setPosition(positionText.getValue());

            // Nhân hệ số lương tương ứng
            if (partText.getValue() == "Technology") {
                if (positionText.getValue() == "CEO") {
                    newNhanvien.setSalary(Integer.parseInt(workdayText.getText()) * 10000);
                }
                if (positionText.getValue() == "Founder") {
                    newNhanvien.setSalary(Integer.parseInt(workdayText.getText()) * 5000);
                }
                if (positionText.getValue() == "Manager") {
                    newNhanvien.setSalary(Integer.parseInt(workdayText.getText()) * 4000);
                }
                if (positionText.getValue() == "Director") {
                    newNhanvien.setSalary(Integer.parseInt(workdayText.getText()) * 3000);
                }
            }
            if (partText.getValue() == "Accounting") {
                if (positionText.getValue() == "CEO") {
                    newNhanvien.setSalary(Integer.parseInt(workdayText.getText()) * 9000);
                }
                if (positionText.getValue() == "Founder") {
                    newNhanvien.setSalary(Integer.parseInt(workdayText.getText()) * 6000);
                }
                if (positionText.getValue() == "Manager") {
                    newNhanvien.setSalary(Integer.parseInt(workdayText.getText()) * 5000);
                }
                if (positionText.getValue() == "Director") {
                    newNhanvien.setSalary(Integer.parseInt(workdayText.getText()) * 3000);
                }
            }
            if (partText.getValue() == "Marketing") {
                if (positionText.getValue() == "CEO") {
                    newNhanvien.setSalary(Integer.parseInt(workdayText.getText()) * 7000);
                }
                if (positionText.getValue() == "Founder") {
                    newNhanvien.setSalary(Integer.parseInt(workdayText.getText()) * 5000);
                }
                if (positionText.getValue() == "Manager") {
                    newNhanvien.setSalary(Integer.parseInt(workdayText.getText()) * 4000);
                }
                if (positionText.getValue() == "Director") {
                    newNhanvien.setSalary(Integer.parseInt(workdayText.getText()) * 2000);
                }
            }
            if (partText.getValue() == "Engineering") {
                if (positionText.getValue() == "CEO") {
                    newNhanvien.setSalary(Integer.parseInt(workdayText.getText()) * 20000);
                }
                if (positionText.getValue() == "Founder") {
                    newNhanvien.setSalary(Integer.parseInt(workdayText.getText()) * 15000);
                }
                if (positionText.getValue() == "Manager") {
                    newNhanvien.setSalary(Integer.parseInt(workdayText.getText()) * 10000);
                }
                if (positionText.getValue() == "Director") {
                    newNhanvien.setSalary(Integer.parseInt(workdayText.getText()) * 9000);
                }
            }

            nhanvienList.add(newNhanvien);
        } else {
            resetText();
            Alert alertAdd = new Alert(Alert.AlertType.INFORMATION);
            alertAdd.setTitle("Thông báo");
            alertAdd.setContentText("Chưa được thêm vào");
            alertAdd.show();
        }
    }
}

private boolean isValidInput(ActionEvent e) {
    return false;
}


private void resetText() {
}


// Xoá
public void delete(ActionEvent e) {
    nhanvien selected = table.getSelectionModel().getSelectedItem();
    nhanvienList.remove(selected);
}

// Đóng
public void close(ActionEvent actionEvent) {
    Alert exitAlert = new Alert(Alert.AlertType.CONFIRMATION, "Confirm", ButtonType.OK, ButtonType.CANCEL);
    Stage stage = (Stage) close1.getScene().getWindow();
    exitAlert.setContentText("Are you sure you want to exit?");
    exitAlert.initModality(Modality.APPLICATION_MODAL);
    exitAlert.initOwner(stage);
    exitAlert.showAndWait();

    if (exitAlert.getResult() == ButtonType.OK) {
        Platform.exit();
    } else {
        exitAlert.close();
    }
}
}