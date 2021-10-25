package com.example.javafxdemo1;
import com.example.javafxdemo1.HelloController;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.FileNotFoundException;
import java.net.URL;

public class MyfxmlLoader {
    public Pane view;

    public Pane getPane(String filename) throws FileNotFoundException {
        try{
            //URL fileurl = HelloController.class.getResource("C:\\Users\\user\\IdeaProjects\\JavaFxDemo1\\src\\main\\resources\\com\\example\\javafxdemo1\\Que1.fxml");
            //URL fileurl = HelloController.class.getResource("JavaFxDemo1\\src\\main\\resources\\com\\example\\javafxdemo1\\"+filename+".fxml");
            URL fileurl = HelloController.class.getResource(filename+".fxml");

            if (filename==null){
                throw new java.io.FileNotFoundException("FXML file not found!!") ;
            }
            view = new FXMLLoader().load(fileurl);
        }
        catch (Exception e){
            System.out.println("Bingo");
        }
    return view;
    }
}
