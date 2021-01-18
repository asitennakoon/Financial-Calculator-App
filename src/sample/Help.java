package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Help {

    public static void help() {

        Label title = new Label("How to Use");
        title.setAlignment(Pos.CENTER);
        title.setLayoutX(243);
        title.setLayoutY(20);
        title.setMinHeight(40);
        title.setMinWidth(150);
        title.setTextAlignment(TextAlignment.CENTER);
        title.setUnderline(true);
        title.setFont(Font.font("SansSerif", FontWeight.BOLD, 20));
        title.setStyle("-fx-background-color: #1cc9c7; -fx-background-radius: 20;");

        Label lb1 = new Label("• You can use this app to easily do several financial calculations such as fixed deposits,");
        lb1.setLayoutX(23);
        lb1.setLayoutY(83);
        lb1.prefHeight(33);
        lb1.prefWidth(555);
        lb1.setFont(Font.font("SansSerif", FontPosture.ITALIC, 14));
        lb1.setStyle("-fx-text-fill: #1cc9c7;");

        Label lb2 = new Label("   regular savings, loans and mortgages.");
        lb2.setLayoutX(23);
        lb2.setLayoutY(105);
        lb2.prefHeight(33);
        lb2.prefWidth(555);
        lb2.setFont(Font.font("SansSerif", FontPosture.ITALIC, 14));
        lb2.setStyle("-fx-text-fill: #1cc9c7;");

        Label lb3 = new Label("• Click on \"Lump Sum Savings\" to do calculations on fixed sum investment with no further");
        lb3.setLayoutX(23);
        lb3.setLayoutY(138);
        lb3.prefHeight(33);
        lb3.prefWidth(555);
        lb3.setFont(Font.font("SansSerif", FontPosture.ITALIC, 14));
        lb3.setStyle("-fx-text-fill: #1cc9c7;");

        Label lb4 = new Label("   payments. \"Savings with Regular Payments\" option is there to do calculations on ");
        lb4.setLayoutX(23);
        lb4.setLayoutY(161);
        lb4.prefHeight(33);
        lb4.prefWidth(555);
        lb4.setFont(Font.font("SansSerif", FontPosture.ITALIC, 14));
        lb4.setStyle("-fx-text-fill: #1cc9c7;");

        Label lb5 = new Label("   savings where there are monthly contributions.");
        lb5.setLayoutX(23);
        lb5.setLayoutY(184);
        lb5.prefHeight(33);
        lb5.prefWidth(555);
        lb5.setFont(Font.font("SansSerif", FontPosture.ITALIC, 14));
        lb5.setStyle("-fx-text-fill: #1cc9c7;");

        Label lb6 = new Label("• \"Loans\" and \"Mortgages\" views can be used to calculate interest rate, monthly pay, ");
        lb6.setLayoutX(23);
        lb6.setLayoutY(217);
        lb6.prefHeight(33);
        lb6.prefWidth(555);
        lb6.setFont(Font.font("SansSerif", FontPosture.ITALIC, 14));
        lb6.setStyle("-fx-text-fill: #1cc9c7;");

        Label lb7 = new Label("   number of payments and total amount of Loans and Mortgages respectively.");
        lb7.setLayoutX(23);
        lb7.setLayoutY(241);
        lb7.prefHeight(33);
        lb7.prefWidth(555);
        lb7.setFont(Font.font("SansSerif", FontPosture.ITALIC, 14));
        lb7.setStyle("-fx-text-fill: #1cc9c7;");

        Label lb8 = new Label("• All you have to do is input data into corresponding text fields and leave the text field of");
        lb8.setLayoutX(23);
        lb8.setLayoutY(274);
        lb8.prefHeight(33);
        lb8.prefWidth(555);
        lb8.setFont(Font.font("SansSerif", FontPosture.ITALIC, 14));
        lb8.setStyle("-fx-text-fill: #1cc9c7;");

        Label lb9 = new Label("  the parameter in which you want the result. When you click on \"Calculate\" that text field");
        lb9.setLayoutX(23);
        lb9.setLayoutY(297);
        lb9.prefHeight(33);
        lb9.prefWidth(555);
        lb9.setFont(Font.font("SansSerif", FontPosture.ITALIC, 14));
        lb9.setStyle("-fx-text-fill: #1cc9c7;");

        Label lb10 = new Label("  will populate with the answer. It is that simple.");
        lb10.setLayoutX(23);
        lb10.setLayoutY(320);
        lb10.prefHeight(33);
        lb10.prefWidth(555);
        lb10.setFont(Font.font("SansSerif", FontPosture.ITALIC, 14));
        lb10.setStyle("-fx-text-fill: #1cc9c7;");

        Label lb11 = new Label("• There is an onscreen keypad on each view to input values for your ease.");
        lb11.setLayoutX(23);
        lb11.setLayoutY(353);
        lb11.prefHeight(33);
        lb11.prefWidth(555);
        lb11.setFont(Font.font("SansSerif", FontPosture.ITALIC, 14));
        lb11.setStyle("-fx-text-fill: #1cc9c7;");

        Label lb12 = new Label("• When you click \"Calculate\" all the input values in the text fields are recorded onto to");
        lb12.setLayoutX(23);
        lb12.setLayoutY(384);
        lb12.prefHeight(33);
        lb12.prefWidth(555);
        lb12.setFont(Font.font("SansSerif", FontPosture.ITALIC, 14));
        lb12.setStyle("-fx-text-fill: #1cc9c7;");

        Label lb13 = new Label("  a file. Each calculator has its' own file for that. Therefore, in case the app was closed by");
        lb13.setLayoutX(23);
        lb13.setLayoutY(407);
        lb13.prefHeight(33);
        lb13.prefWidth(555);
        lb13.setFont(Font.font("SansSerif", FontPosture.ITALIC, 14));
        lb13.setStyle("-fx-text-fill: #1cc9c7;");

        Label lb14 = new Label("  you accidentally, you can retrieve all the values into exact text fields by clicking \"Retrieve");
        lb14.setLayoutX(23);
        lb14.setLayoutY(428);
        lb14.prefHeight(33);
        lb14.prefWidth(555);
        lb14.setFont(Font.font("SansSerif", FontPosture.ITALIC, 14));
        lb14.setStyle("-fx-text-fill: #1cc9c7;");

        Label lb15 = new Label("  Previous Data\" button.");
        lb15.setLayoutX(23);
        lb15.setLayoutY(449);
        lb15.prefHeight(33);
        lb15.prefWidth(555);
        lb15.setFont(Font.font("SansSerif", FontPosture.ITALIC, 14));
        lb15.setStyle("-fx-text-fill: #1cc9c7;");

        Button close = new Button("Close");
        close.setAlignment(Pos.CENTER);
        close.setLayoutX(500);
        close.setLayoutY(460);
        close.prefWidth(85);
        close.prefHeight(40);
        close.setTextAlignment(TextAlignment.CENTER);
        close.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));
        close.setStyle("-fx-background-radius: 20; -fx-background-color: #0ccf94;");

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().add(title);
        anchorPane.getChildren().add(lb1);
        anchorPane.getChildren().add(lb2);
        anchorPane.getChildren().add(lb3);
        anchorPane.getChildren().add(lb4);
        anchorPane.getChildren().add(lb5);
        anchorPane.getChildren().add(lb6);
        anchorPane.getChildren().add(lb7);
        anchorPane.getChildren().add(lb8);
        anchorPane.getChildren().add(lb9);
        anchorPane.getChildren().add(lb10);
        anchorPane.getChildren().add(lb11);
        anchorPane.getChildren().add(lb12);
        anchorPane.getChildren().add(lb13);
        anchorPane.getChildren().add(lb14);
        anchorPane.getChildren().add(lb15);
        anchorPane.getChildren().add(close);
        anchorPane.setStyle("-fx-background-color: #5c615f;");

        Scene scene = new Scene(anchorPane, 610, 506);
        Stage window = new Stage();
        window.setScene(scene);
        window.show();

        close.setOnAction(event -> {
            window.close();
        });
    }
}
