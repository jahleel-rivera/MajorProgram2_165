/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import java.io.File;
import java.util.Optional;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author exchange
 */
public class FleetFX extends Application implements EventHandler<ActionEvent> {

    Button viewButton;// creation of all button objects
    Button addButton;
    Button loadButton;
    Button saveButton;
    Button exitButton;
    Fleet fleet = new Fleet();

    @Override
    public void start(Stage primaryStage) throws Exception {
        viewButton = new Button("View");// setting values to buttons
        addButton = new Button("Add");
        loadButton = new Button("Load");
        saveButton = new Button("Save");
        exitButton = new Button("Exit");

        viewButton.setOnAction(this);
        addButton.setOnAction(this);
        loadButton.setOnAction(this);
        saveButton.setOnAction(this);
        exitButton.setOnAction(this);

        BorderPane borderPane = new BorderPane();//creation of all panes
        StackPane layout = new StackPane();
        VBox vLayout = new VBox();
        Scene mainScene = new Scene(borderPane);

        primaryStage.setScene(mainScene);
        primaryStage.show();

        ListView<String> list = new ListView<>();
        ObservableList<String> items = FXCollections.observableArrayList("Automobile", "PassengerVan", "CargoVan");
        list.setItems(items);

        borderPane.setPrefSize(500, 500);
        vLayout.setPrefWidth(100);
        vLayout.setSpacing(10);
        vLayout.setPadding(new Insets(30, 20, 20, 5));
        vLayout.getChildren().addAll(viewButton, addButton, loadButton, saveButton, exitButton);

        borderPane.setRight(vLayout);
        borderPane.setCenter(list);

    }

    void start() {//method to display GUI
        launch();
    }

    @Override
    public void handle(ActionEvent event) {//Handler method used to make buttons actually work
        GridPane pg = new GridPane();
        Button button = (Button) event.getSource();
        if (button == addButton) {

        } else if (button == viewButton) {

        } else if (button == saveButton) {

            FileChooser jFile = new FileChooser();
            File file1 = jFile.showSaveDialog(null);
            if (file1 != null) {
                fleet.loadFleet(file1.getAbsolutePath());
            }
        } else if (button == loadButton) {
            FileChooser jFile = new FileChooser();
            File file1 = jFile.showSaveDialog(null);
            if (file1 != null) {
                fleet.loadFleet(file1.getAbsolutePath());
            } 
        }else if (button == exitButton) {
            Dialog<ButtonType> e = new Dialog();
            ButtonType yes = new ButtonType("Yes", ButtonData.OK_DONE);
            ButtonType no = new ButtonType("No", ButtonData.OK_DONE);
            ButtonType cancel = new ButtonType("Cancel", ButtonData.OK_DONE);
            e.getDialogPane().getButtonTypes().add(yes);
            e.getDialogPane().getButtonTypes().add(no);
            e.getDialogPane().getButtonTypes().add(cancel);
            e.setContentText("Would you like to save before you exit?");
            Optional<ButtonType> db = e.showAndWait();
            System.out.println(db.get());
            if(db.isPresent() && db.get() != cancel){
                if(db.get() == yes){
                    FileChooser jFile = new FileChooser();
                    File file1 = jFile.showSaveDialog(null);
                    if(file1 != null){
                        fleet.saveFleet(file1.getAbsolutePath());
                    }else{
                        return;
                    }
                }
                System.exit(0);
            }
            }

        }
    }

