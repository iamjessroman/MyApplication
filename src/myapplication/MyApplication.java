/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;

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
        Button button = new Button("My Button");
        TextArea textArea = new TextArea();
        root.getChildren().add(button);
        root.getChildren().add(textArea);
        scene.setRoot(root);
        stage.setScene(scene);
        stage.show();

        button.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                String string = textArea.getText();
                Parqueos p = new Parqueos();
                p.setVisible(true);
                Parqueos.Text.setText(string);
     
            }
        });

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
