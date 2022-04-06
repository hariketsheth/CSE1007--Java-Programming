package com.mycompany.mavenproject1;  
import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.*;  
import javafx.scene.layout.BorderPane;  
import javafx.stage.Stage;  
public class App extends Application {  
    public static void main(String[] args) {  
    launch(args);  
        }  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {   
        BorderPane root = new BorderPane();  
        Scene scene = new Scene(root,200,300);  
        MenuBar menubar = new MenuBar();  
        Menu FileMenu = new Menu("File");  
        MenuItem filemenu1=new MenuItem("New");  
        MenuItem filemenu2=new MenuItem("Save");  
        MenuItem filemenu3=new MenuItem("Exit");  
        Menu EditMenu=new Menu("Edit");  
        MenuItem EditMenu1=new MenuItem("Cut");  
        MenuItem EditMenu2=new MenuItem("Copy");  
        MenuItem EditMenu3=new MenuItem("Paste");
        MenuItem EditMenu4=new MenuItem("Replace");
        MenuItem EditMenu5=new MenuItem("Execute");
        Menu FormatMenu = new Menu("Format"); 
        MenuItem FormatMenu1 =new MenuItem("Color"); 
        MenuItem FormatMenu2 =new MenuItem("Font"); 
        MenuItem FormatMenu3 =new MenuItem("Size"); 
        MenuItem FormatMenu4 =new MenuItem("Debug"); 

        EditMenu.getItems().addAll(EditMenu1,EditMenu2,EditMenu3, EditMenu4, EditMenu5);  
        FormatMenu.getItems().addAll(FormatMenu1,FormatMenu2,FormatMenu3, FormatMenu4);  
        root.setTop(menubar);  
        FileMenu.getItems().addAll(filemenu1,filemenu2,filemenu3);  
        menubar.getMenus().addAll(FileMenu,EditMenu, FormatMenu);  
        primaryStage.setScene(scene);  
        primaryStage.show();  
          
    }     
}  