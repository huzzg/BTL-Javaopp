package quanlynhansu.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

   public class main extends Application{
   @Override
   public void start(Stage primaryStage) throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("../giaodien/main.fxml"));
        primaryStage.setTitle("Quan ly nhan su");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
   }
    public static void main(String[] args) {
        launch(args);
    }
}
