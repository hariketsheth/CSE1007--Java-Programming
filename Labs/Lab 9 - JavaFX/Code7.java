package com.mycompany.mavenproject3;  
import javafx.application.Application; 
import javafx.collections.ObservableList; 
import javafx.scene.Scene; 
import javafx.scene.control.TextField; 
import javafx.scene.layout.BorderPane; 
import javafx.stage.Stage; 
         
public class App extends Application { 
   @Override 
   public void start(Stage stage) {      
      BorderPane bPane = new BorderPane();   

      bPane.setTop(new TextField("Top")); 
      bPane.setBottom(new TextField("Bottom")); 
      bPane.setLeft(new TextField("Left")); 
      bPane.setRight(new TextField("Right")); 
      bPane.setCenter(new TextField("Center")); 
      
      Scene scene = new Scene(bPane);  
      stage.setTitle("BorderPane Example"); 
      stage.setScene(scene);           
      stage.show(); 
   } 
   public static void main(String args[]){ 
      launch(args); 
   } 
}