package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label title = new Label("Financial Calculator");
        title.setAlignment(Pos.CENTER);
        title.setLayoutY(37);
        title.setLayoutX(119);
        title.setMinHeight(40);
        title.setMinWidth(248);
        title.setStyle("-fx-background-color: #1cc9c7; -fx-background-radius: 20;");
        title.setTextAlignment(TextAlignment.CENTER);
        title.setFont(Font.font("SansSerif", FontWeight.BOLD, 24));

        Button lumpSum = new Button("Savings with Lump Sum");
        lumpSum.setAlignment(Pos.CENTER);
        lumpSum.setLayoutY(121);
        lumpSum.setLayoutX(109);
        lumpSum.setMinHeight(32);
        lumpSum.setMinWidth(269);
        lumpSum.setStyle("-fx-background-radius: 20; -fx-background-color: #0ccf94;");
        lumpSum.setTextAlignment(TextAlignment.CENTER);
        lumpSum.setFont(Font.font("SansSerif Bold", FontWeight.BOLD, 16));

        Button regularPay = new Button("Savings with Regular Payments");
        regularPay.setAlignment(Pos.CENTER);
        regularPay.setLayoutY(169);
        regularPay.setLayoutX(108);
        regularPay.setMinHeight(32);
        regularPay.setMinWidth(269);
        regularPay.setStyle("-fx-background-radius: 20; -fx-background-color: #0ccf94;");
        regularPay.setTextAlignment(TextAlignment.CENTER);
        regularPay.setFont(Font.font("SansSerif Bold", FontWeight.BOLD, 16));

        Button loans = new Button("Loans");
        lumpSum.setAlignment(Pos.CENTER);
        loans.setLayoutY(217);
        loans.setLayoutX(107);
        loans.setMinHeight(32);
        loans.setMinWidth(128);
        loans.setStyle("-fx-background-radius: 20; -fx-background-color: #0ccf94;");
        loans.setTextAlignment(TextAlignment.CENTER);
        loans.setFont(Font.font("SansSerif Bold", FontWeight.BOLD, 16));

        Button mortgages = new Button("Mortgages");
        lumpSum.setAlignment(Pos.CENTER);
        mortgages.setLayoutY(217);
        mortgages.setLayoutX(249);
        mortgages.setMinHeight(32);
        mortgages.setMinWidth(128);
        mortgages.setStyle("-fx-background-radius: 20; -fx-background-color: #0ccf94;");
        mortgages.setTextAlignment(TextAlignment.CENTER);
        mortgages.setFont(Font.font("SansSerif Bold", FontWeight.BOLD, 16));

        Button help = new Button("Help");
        lumpSum.setAlignment(Pos.CENTER);
        help.setLayoutY(265);
        help.setLayoutX(108);
        help.setMinHeight(32);
        help.setMinWidth(128);
        help.setStyle("-fx-background-radius: 20; -fx-background-color: #0ccf94;");
        help.setTextAlignment(TextAlignment.CENTER);
        help.setFont(Font.font("SansSerif Bold", FontWeight.BOLD, 16));

        Button exit = new Button("Exit");
        lumpSum.setAlignment(Pos.CENTER);
        exit.setLayoutY(265);
        exit.setLayoutX(249);
        exit.setMinHeight(32);
        exit.setMinWidth(128);
        exit.setStyle("-fx-background-radius: 20; -fx-background-color: #0ccf94;");
        exit.setTextAlignment(TextAlignment.CENTER);
        exit.setFont(Font.font("SansSerif Bold", FontWeight.BOLD, 16));

        //Action events to open corresponding calculators
        lumpSum.setOnAction(event -> {
            LumpSum.lumpSum();
        });
        regularPay.setOnAction(event -> {
            RegularPayments.regularPayments();
        });
        loans.setOnAction(event -> {
            Loans.loans();
        });
        mortgages.setOnAction(event -> {
            Mortgages.mortgages();
        });
        help.setOnAction(event -> {
            Help.help();
        });
        exit.setOnAction(event -> {
            primaryStage.close();
        });

        AnchorPane root = new AnchorPane();
        root.getChildren().add(title);
        root.getChildren().add(lumpSum);
        root.getChildren().add(regularPay);
        root.getChildren().add(loans);
        root.getChildren().add(mortgages);
        root.getChildren().add(help);
        root.getChildren().add(exit);
        root.setStyle("-fx-background-color: #5c615f;");
        primaryStage.setTitle("Financial Calculator");
        primaryStage.setScene(new Scene(root, 485, 349));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
