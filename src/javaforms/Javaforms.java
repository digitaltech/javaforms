/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaForms;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.DragEvent;
/**
 *
 * @author sourabh
 */
public class Javaforms extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label lblUsrNm = new Label("User Name:");
        Label lblUsrPass = new Label("User Password");
        TextField userName = new TextField();
        
        //userName.setText("Enter user name here");
        TextField userPasswd = new TextField();
        Button userSubmit = new Button();
        //userSubmit.setText("");
        
        userSubmit.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               
            }
        });
        
        Pane root = new Pane();
        userSubmit.setLayoutX(100);
        userSubmit.setLayoutY(150);
        userName.setLayoutX(100);
        userName.setLayoutY(100);
        root.getChildren().add(userSubmit);
        root.getChildren().add(userName);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Java Form Submit");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
