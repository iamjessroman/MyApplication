/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;

import java.awt.Color;
import java.awt.Event;
import java.awt.image.BufferedImage;
import java.io.File;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javax.imageio.ImageIO;

public class MyApplication extends Application implements EventHandler {
 private Stage stage = null;
 private boolean estaFull = false;
  private Scene scene = null;
    @Override
    public void start(Stage stage) {
        
        Cliente cl = new Cliente();
        cl.downloadImage();
        cl.downloadJson();
        this.stage = stage;
        stage.setWidth(1200);
        stage.setHeight(720);
        Scene scene = new Scene(new Group());
        VBox root = new VBox();
        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();
        webEngine.load("http://localhost:9090/Cliente/");
        root.getChildren().addAll(browser);
        scene.setRoot(root);
        stage.setScene(scene);
        stage.show();

 Pixel obj = new Pixel();
//        obj.metodo();
    }
    @Override
    public void handle(javafx.event.Event event) {       
        pantallaCompleta(stage);
                      
    }
    public void pantallaCompleta(Stage escena) {
        if(!estaFull) {
            stage.setFullScreen(true);
        } else {
            stage.setFullScreen(false);
        }
        estaFull = !estaFull;     
 
    }

    public static void main(String[] args)throws Exception  {
        launch(args);
        
        
        
    }
    


    
}
