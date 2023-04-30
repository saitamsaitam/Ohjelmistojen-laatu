package com.example.javafxtesti;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindow extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // FlowPane as the root of our scene graph
        FlowPane pane = new FlowPane();
        pane.setHgap(2);

        // text field for typing in numbers
        TextField numberField = new TextField();
        numberField.setPrefColumnCount(3);

        // text field for typing in numbers
        TextField numberField2 = new TextField();
        numberField2.setPrefColumnCount(3);

        // text field for typing in numbers
        TextField numberField3 = new TextField();
        numberField3.setPrefColumnCount(3);

        pane.getChildren().addAll(new Label("Number 1: "), numberField, new Label("Number 2: "), numberField2, new Label("Results: "), numberField3);

        // Hbox for buttons
        HBox hbox = new HBox(5);
        Button btnAdd = new Button("Add");
        Button btnSubtract = new Button("Subtract");
        Button btnMultiply = new Button("Multiply");
        Button btnDivide = new Button("Divide");
        Button btnReset = new Button("Reset");

        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(btnAdd, btnSubtract, btnMultiply, btnDivide, btnReset);


        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hbox);

        Scene scene = new Scene(borderPane, 500, 250);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();

        // button for adding numbers
        btnAdd.setOnAction((event) -> {
            int num1 = Integer.parseInt(numberField.getText());
            int num2 = Integer.parseInt(numberField2.getText());
            int result = num1 + num2;
            numberField3.setText(String.valueOf(result));
        });

        // button for subtracting numbers
        btnSubtract.setOnAction((event) -> {
            int num1 = Integer.parseInt(numberField.getText());
            int num2 = Integer.parseInt(numberField2.getText());
            int result = num1 - num2;
            numberField3.setText(String.valueOf(result));
        });

        // button for multiplying numbers
        btnMultiply.setOnAction((event) -> {
            int num1 = Integer.parseInt(numberField.getText());
            int num2 = Integer.parseInt(numberField2.getText());
            int result = num1 * num2;
            numberField3.setText(String.valueOf(result));
        });

        // button for dividing numbers
        btnDivide.setOnAction((event) -> {
            int num1 = Integer.parseInt(numberField.getText());
            int num2 = Integer.parseInt(numberField2.getText());
            int result = num1 / num2;
            numberField3.setText(String.valueOf(result));
        });

        // button for resetting numbers
        btnReset.setOnAction((event) -> {
            numberField.setText("");
            numberField2.setText("");
            numberField3.setText("");
        });

    }

    public static void main(String[] args) {
        launch();
    }
}