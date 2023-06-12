package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class ClassmateController {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Arjay just = new  Arjay(); 
    Lhara = new Lhara();
   Joan = new Joan();
    Jherick = new Jherick();
    Ackzel = new Ackzel();
    

    public void initialize() {

        just.setName("Arjay");
        just.setGender("Male");

        josh.setName("Ackzel");
        josh.setGender("Male");

        sim.setName("Lhara");
        sim.setGender("Female");

        lu.setName("Joan");
        lu.setGender("Female");

        lance.setName("Jherick");
        lance.setGender("Male");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Hi I am " + arjay.getName() + " and my gender is " + josh.getGender());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Hi I am " + lhara .getName() + " and my gender is " + sim.getGender());
        }

        if (sourceButton == btn3) {
            //alert.setContentText("Hi I am " + joan.getName() + " and my gender is " + lu.getGender());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Hi I am " +jherick.getName() + " and my gender is " + lance.getGender());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Hi I am " + ackzel.getName() + " and my gender is " + just.getGender());
        }

        alert.showAndWait();

    }
}