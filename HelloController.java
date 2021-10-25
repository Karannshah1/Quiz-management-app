package com.example.javafxdemo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.FileNotFoundException;


public class HelloController {
    @FXML
    public BorderPane MainPane;

    @FXML

    public void forQ1(ActionEvent event) throws FileNotFoundException {
        MyfxmlLoader object = new MyfxmlLoader();
        Pane view = object.getPane("Que1");
        System.out.println("This is Question 1");
        MainPane.setCenter(view);
    }
    public void forQ2(ActionEvent event) throws FileNotFoundException{
        MyfxmlLoader object = new MyfxmlLoader();
        Pane view = object.getPane("Que2");
        System.out.println("This is Question 2");
        MainPane.setCenter(view);
    }
}
//fx:controller="com.example.javafxdemo1.Que1"