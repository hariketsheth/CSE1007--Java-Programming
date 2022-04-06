package com.mycompany.mavenproject3;  
import javafx.application.Application;
import javafx.collections.ObservableList; 
import javafx.geometry.Insets; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.FlowPane; 
import javafx.scene.shape.Sphere; 
import javafx.stage.Stage; 
         
public class App extends Application { 
   public void start(Stage stage) {      
      Button button1 = new Button("Button1");       
      Button button2 = new Button("Button2");       
      Button button3 = new Button("Button3");       
      Button button4 = new Button("Button4");       
      FlowPane flowPane = new FlowPane();    

      flowPane.setHgap(25); 
      flowPane.setMargin(button1, new Insets(20, 0, 20, 20)); 
      ObservableList list = flowPane.getChildren(); 
      list.addAll(button1, button2, button3, button4); 
      Scene scene = new Scene(flowPane);  
      stage.setTitle("Flow Pane"); 
      stage.setScene(scene); 
      stage.show(); 
   } 
   public static void main(String args[]){
      launch(args); 
   } 
}