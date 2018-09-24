/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class MyApplication extends Application implements EventHandler {

    private Stage stage = null;
    private boolean estaFull = false;
    private Scene scene = null;

    @Override
    public void start(Stage stage) {

        this.stage = stage;
        stage.setWidth(1200);
        stage.setHeight(720);
        Scene scene = new Scene(new Group());
        VBox root = new VBox();
        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();
        webEngine.load("http://localhost:9090/Cliente/");
        root.getChildren().addAll(browser);
        Button button = new Button("Cargar");
        TextArea textArea = new TextArea();
        
        root.getChildren().add(textArea);
        root.getChildren().add(button);
        scene.setRoot(root);
        stage.setScene(scene);
        stage.show();

        button.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                String string = textArea.getText();
                Parqueos p = new Parqueos();
                p.setVisible(true);

                String ruta = "C:\\Users\\Tesis\\Desktop\\archivo.txt";
                File archivo = new File(ruta);
                BufferedWriter bw;
                try {
                if (archivo.exists()) {
                        bw = new BufferedWriter(new FileWriter(archivo));
                        bw.write(string);
                  
                } else {
                    bw = new BufferedWriter(new FileWriter(archivo));
                    bw.write(string);
                }
                bw.close();
                  } catch (IOException ex) {
                        Logger.getLogger(MyApplication.class.getName()).log(Level.SEVERE, null, ex);
                    }
            
        }
    }

);

    }

    @Override
        public void handle(javafx.event.Event event) {
        pantallaCompleta(stage);

    }

    public void pantallaCompleta(Stage escena) {
        if (!estaFull) {
            stage.setFullScreen(true);
        } else {
            stage.setFullScreen(false);
        }
        estaFull = !estaFull;

    }

    public static void main(String[] args) throws Exception {
        launch(args);

    }

}
