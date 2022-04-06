package com.mycompany.mavenproject3;  
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.*;
import javafx.scene.Group;
  
public class App extends Application {
    public void start(Stage stage)
    {
        try {
            stage.setTitle("HBox");
            HBox hbox = new HBox();
            for (int i = 0; i < 10; i++) {
                hbox.getChildren().add(new Button("Button " 
                                           + (int)(i + 1)));
            }
            Scene scene = new Scene(hbox, 800, 300);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String args[])
    {
        launch(args);
    }
}