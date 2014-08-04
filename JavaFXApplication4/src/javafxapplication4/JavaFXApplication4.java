/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapplication4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;



public class JavaFXApplication4 extends Application{
    @Override
    public void start(Stage stage) {
        stage.setTitle("HTML");
        stage.setWidth(500);
        stage.setHeight(500);
        Scene scene = new Scene(new Group());

       // VBox root = new VBox();     

      WebView browser = new WebView();
      browser.setMinWidth(1500); //used to set the width of the web page inside of our application that will appear
      browser.setMinHeight(800);
        WebEngine webEngine = browser.getEngine();
        webEngine.load("http://localhost/testfr/signup.php");
       
        ScrollPane scrollPane = new ScrollPane();
      scrollPane.setContent(browser);
       // webEngine.loadContent("<b>asdf</b>");

     //   root.getChildren().addAll(scrollPane);
      // scene.setRoot(root);

        stage.setScene(new Scene(scrollPane));
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}