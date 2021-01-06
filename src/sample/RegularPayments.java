package sample;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RegularPayments {

    public static void regularPayments() {
        Label lblInterest = new Label("Interest Rate :");
        lblInterest.setLayoutX(59);
        lblInterest.setLayoutY(80);
        lblInterest.setMinWidth(97);
        lblInterest.setMinHeight(17);
        lblInterest.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        lblInterest.setStyle("-fx-text-fill: #1cc9c7;");
        TextField tfInterest = new TextField();
        tfInterest.setLayoutX(190);
        tfInterest.setLayoutY(80);
        tfInterest.setMaxWidth(97);
        tfInterest.setMinHeight(25);
        tfInterest.setStyle("-fx-background-radius: 20;");

        Label lblFinal = new Label("Final Value :");
        lblFinal.setLayoutX(70);
        lblFinal.setLayoutY(123);
        lblFinal.setMinWidth(89);
        lblFinal.setMinHeight(17);
        lblFinal.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        lblFinal.setStyle("-fx-text-fill: #1cc9c7;");
        TextField tfFinal = new TextField();
        tfFinal.setLayoutX(190);
        tfFinal.setLayoutY(123);
        tfFinal.setMaxWidth(97);
        tfFinal.setMinHeight(25);
        tfFinal.setStyle("-fx-background-radius: 20;");

        Label lblPresent = new Label("Present Value :");
        lblPresent.setLayoutX(52);
        lblPresent.setLayoutY(166);
        lblPresent.setMinWidth(105);
        lblPresent.setMinHeight(17);
        lblPresent.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        lblPresent.setStyle("-fx-text-fill: #1cc9c7;");
        TextField tfPresent = new TextField();
        tfPresent.setLayoutX(190);
        tfPresent.setLayoutY(166);
        tfPresent.setMaxWidth(97);
        tfPresent.setMinHeight(25);
        tfPresent.setStyle("-fx-background-radius: 20;");

        Label lblTime = new Label("Time :");
        lblTime.setLayoutX(112);
        lblTime.setLayoutY(209);
        lblTime.setMinWidth(42);
        lblTime.setMinHeight(17);
        lblTime.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        lblTime.setStyle("-fx-text-fill: #1cc9c7;");
        TextField tfTime = new TextField();
        tfTime.setLayoutX(190);
        tfTime.setLayoutY(209);
        tfTime.setMaxWidth(97);
        tfTime.setMinHeight(25);
        tfTime.setStyle("-fx-background-radius: 20;");

        Label lblPayment = new Label("Monthly Payment :");
        lblPayment.setLayoutX(30);
        lblPayment.setLayoutY(252);
        lblPayment.setMinWidth(70);
        lblPayment.setMinHeight(17);
        lblPayment.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        lblPayment.setStyle("-fx-text-fill: #1cc9c7;");
        TextField tfPayment = new TextField();
        tfPayment.setLayoutX(190);
        tfPayment.setLayoutY(252);
        tfPayment.setMaxWidth(97);
        tfPayment.setMinHeight(25);
        tfPayment.setStyle("-fx-background-radius: 20;");

        Separator separator = new Separator();
        separator.setOrientation(Orientation.VERTICAL);
        separator.setLayoutX(328);
        separator.setLayoutY(74);
        separator.setMinHeight(210);
        separator.setMinWidth(5);

        Button seven = new Button("7");
        seven.setLayoutX(376);
        seven.setLayoutY(82);
        seven.setMinWidth(25);
        seven.setMinHeight(25);
        seven.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        seven.setStyle("-fx-background-color: #1cc9c7; -fx-background-radius: 50;");

        Button eight = new Button("8");
        eight.setLayoutX(413);
        eight.setLayoutY(82);
        eight.setMinWidth(25);
        eight.setMinHeight(25);
        eight.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        eight.setStyle("-fx-background-color: #1cc9c7; -fx-background-radius: 50;");

        Button nine = new Button("9");
        nine.setLayoutX(451);
        nine.setLayoutY(82);
        nine.setMinWidth(25);
        nine.setMinHeight(25);
        nine.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        nine.setStyle("-fx-background-color: #1cc9c7; -fx-background-radius: 50;");

        Button four = new Button("4");
        four.setLayoutX(376);
        four.setLayoutY(122);
        four.setMinWidth(25);
        four.setMinHeight(25);
        four.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        four.setStyle("-fx-background-color: #1cc9c7; -fx-background-radius: 50;");

        Button five = new Button("5");
        five.setLayoutX(413);
        five.setLayoutY(122);
        five.setMinWidth(25);
        five.setMinHeight(25);
        five.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        five.setStyle("-fx-background-color: #1cc9c7; -fx-background-radius: 50;");

        Button six = new Button("6");
        six.setLayoutX(451);
        six.setLayoutY(122);
        six.setMinWidth(25);
        six.setMinHeight(25);
        six.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        six.setStyle("-fx-background-color: #1cc9c7; -fx-background-radius: 50;");

        Button one = new Button("1");
        one.setLayoutX(376);
        one.setLayoutY(161);
        one.setMinWidth(25);
        one.setMinHeight(25);
        one.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        one.setStyle("-fx-background-color: #1cc9c7; -fx-background-radius: 50;");

        Button two = new Button("2");
        two.setLayoutX(413);
        two.setLayoutY(161);
        two.setMinWidth(25);
        two.setMinHeight(25);
        two.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        two.setStyle("-fx-background-color: #1cc9c7; -fx-background-radius: 50;");

        Button three = new Button("3");
        three.setLayoutX(451);
        three.setLayoutY(161);
        three.setMinWidth(25);
        three.setMinHeight(25);
        three.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        three.setStyle("-fx-background-color: #1cc9c7; -fx-background-radius: 50;");

        Button zero = new Button("0");
        zero.setLayoutX(377);
        zero.setLayoutY(198);
        zero.setMinWidth(64);
        zero.setMinHeight(25);
        zero.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        zero.setStyle("-fx-background-color: #1cc9c7; -fx-background-radius: 50;");

        Button decimal = new Button(".");
        decimal.setLayoutX(451);
        decimal.setLayoutY(198);
        decimal.setMinWidth(28);
        decimal.setMinHeight(25);
        decimal.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        decimal.setStyle("-fx-background-color: #1cc9c7; -fx-background-radius: 50;");

        Button delete = new Button("Delete");
        delete.setLayoutX(377);
        delete.setLayoutY(235);
        delete.setMinWidth(64);
        delete.setMinHeight(25);
        delete.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        delete.setStyle("-fx-background-color: #1cc9c7; -fx-background-radius: 50;");

        Button minus = new Button("-");
        minus.setLayoutX(451);
        minus.setLayoutY(235);
        minus.setMinWidth(28);
        minus.setMinHeight(25);
        minus.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        minus.setStyle("-fx-background-color: #1cc9c7; -fx-background-radius: 50;");

        Button calculate = new Button("Calculate");
        calculate.setAlignment(Pos.CENTER);
        calculate.setLayoutX(195);
        calculate.setLayoutY(320);
        calculate.setMinWidth(144);
        calculate.prefHeight(32);
        calculate.setTextAlignment(TextAlignment.CENTER);
        calculate.setFont(Font.font("SansSerif", FontWeight.BOLD, 16));
        calculate.setStyle("-fx-background-radius: 20; -fx-background-color: #0ccf94;");

        Button retrieve = new Button("Retrieve Previous Data");
        retrieve.setAlignment(Pos.CENTER);
        retrieve.setLayoutX(354);
        retrieve.setLayoutY(23);
        retrieve.prefWidth(65);
        retrieve.prefHeight(23);
        retrieve.setTextAlignment(TextAlignment.CENTER);
        retrieve.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));
        retrieve.setStyle("-fx-background-radius: 20; -fx-background-color: #0ccf94;");

        Button goBack = new Button("Go Back");
        goBack.setAlignment(Pos.CENTER);
        goBack.setLayoutX(25);
        goBack.setLayoutY(23);
        goBack.prefWidth(65);
        goBack.prefHeight(23);
        goBack.setTextAlignment(TextAlignment.CENTER);
        goBack.setFont(Font.font("SansSerif", FontWeight.BOLD, 12));
        goBack.setStyle("-fx-background-radius: 20; -fx-background-color: #0ccf94;");

        File file = new File("RegularPayRecords.txt");

        calculate.setOnAction(event -> {
            try {
                final double compounds = 12;
                String interest = tfInterest.getText();
                double interestRate = Double.parseDouble(interest) / 100.0;
                if (tfFinal.getText().isEmpty()) {
                    String presentValue = tfPresent.getText();
                    String time = tfTime.getText();
                    String payment = tfPayment.getText();
                    double principalInterest = Double.parseDouble(presentValue) * Math.pow(1 + interestRate / compounds, compounds * Double.parseDouble(time));
                    double A = Double.parseDouble(payment) * ((Math.pow(1 + interestRate / compounds, compounds * Double.parseDouble(time)) - 1) * compounds / interestRate);
                    double totalA = principalInterest + A;
                    tfFinal.setText("" + Math.round(totalA * 100.0) / 100.0);
                } else if (tfPayment.getText().isEmpty()) {
                    String futureValue = tfFinal.getText();
                    String presentValue = tfPresent.getText();
                    String time = tfTime.getText();
                    double principalInterest = Double.parseDouble(presentValue) * Math.pow(1 + interestRate / compounds, compounds * Double.parseDouble(time));
                    double PMT = (Double.parseDouble(futureValue) - principalInterest) / ((Math.pow(1 + interestRate / compounds, compounds * Double.parseDouble(time)) - 1) * compounds / interestRate);
                    tfPayment.setText("" + Math.round(PMT * 100.0) / 100.0);
                } else if (tfPresent.getText().isEmpty()) {
                    String futureValue = tfFinal.getText();
                    String time = tfTime.getText();
                    String payment = tfPayment.getText();
                    double P = (Double.parseDouble(futureValue) - (Double.parseDouble(payment) * (Math.pow(1 + interestRate / compounds, compounds * Double.parseDouble(time)) - 1) * compounds / interestRate)) / Math.pow(1 + interestRate / compounds, compounds * Double.parseDouble(time));
                    tfPresent.setText("" + Math.round(P * 100.0) / 100.0);
                } else if (tfTime.getText().isEmpty()) {
                    String futureValue = tfFinal.getText();
                    String presentValue = tfPresent.getText();
                    String payment = tfPayment.getText();
                    double t = Math.log((Double.parseDouble(futureValue) * interestRate + Double.parseDouble(payment) * compounds) / (Double.parseDouble(payment) * compounds + interestRate * Double.parseDouble(presentValue))) / (compounds * Math.log(1 + interestRate / compounds));
                    tfTime.setText("" + Math.round(t));
                }
            } catch (NumberFormatException exception) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Invalid Inputs");
                alert.setHeaderText("Calculation cannot be done");
                alert.setContentText("There can only be one empty text field. There cannot be non-numeric input values either. Please enter correct values.");
                alert.showAndWait();
            }

            FileWriter fileWriter = null;
            PrintWriter printWriter = null;
            try {
                fileWriter = new FileWriter(file);
                printWriter = new PrintWriter(fileWriter, true);
                printWriter.println(tfInterest.getText());
                printWriter.println(tfFinal.getText());
                printWriter.println(tfPresent.getText());
                printWriter.println(tfTime.getText());
                printWriter.println(tfPayment.getText());
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileWriter.close();
                    printWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        retrieve.setOnAction(event -> {
            TextField[] textFields = {tfInterest, tfFinal, tfPresent, tfTime, tfPayment};
            Scanner scanner = null;
            int i = 0;
            try {
                scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    String string = scanner.nextLine();
                    textFields[i].setText(string);
                    i++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Keyboard keyboard = new Keyboard();
        keyboard.installListener(tfInterest, tfFinal, tfPresent, tfTime, tfPayment);

        one.setOnAction(event -> {
            keyboard.selectedTextField.appendText("" + 1);
        });
        two.setOnAction(event -> {
            keyboard.selectedTextField.appendText("" + 2);
        });
        three.setOnAction(event -> {
            keyboard.selectedTextField.appendText("" + 3);
        });
        four.setOnAction(event -> {
            keyboard.selectedTextField.appendText("" + 4);
        });
        five.setOnAction(event -> {
            keyboard.selectedTextField.appendText("" + 5);
        });
        six.setOnAction(event -> {
            keyboard.selectedTextField.appendText("" + 6);
        });
        seven.setOnAction(event -> {
            keyboard.selectedTextField.appendText("" + 7);
        });
        eight.setOnAction(event -> {
            keyboard.selectedTextField.appendText("" + 8);
        });
        nine.setOnAction(event -> {
            keyboard.selectedTextField.appendText("" + 9);
        });
        zero.setOnAction(event -> {
            keyboard.selectedTextField.appendText("" + 0);
        });
        decimal.setOnAction(event -> {
            keyboard.selectedTextField.appendText(".");
        });
        minus.setOnAction(event -> {
            keyboard.selectedTextField.appendText("-");
        });
        delete.setOnAction(event -> {
            keyboard.selectedTextField.setText(keyboard.selectedTextField.getText(0, keyboard.selectedTextField.getLength() - 1));
        });

        AnchorPane root = new AnchorPane();
        root.getChildren().add(lblInterest);
        root.getChildren().add(tfInterest);
        root.getChildren().add(lblFinal);
        root.getChildren().add(tfFinal);
        root.getChildren().add(lblPresent);
        root.getChildren().add(tfPresent);
        root.getChildren().add(lblTime);
        root.getChildren().add(tfTime);
        root.getChildren().add(lblPayment);
        root.getChildren().add(tfPayment);
        root.getChildren().add(separator);
        root.getChildren().add(one);
        root.getChildren().add(two);
        root.getChildren().add(three);
        root.getChildren().add(four);
        root.getChildren().add(five);
        root.getChildren().add(six);
        root.getChildren().add(seven);
        root.getChildren().add(eight);
        root.getChildren().add(nine);
        root.getChildren().add(zero);
        root.getChildren().add(decimal);
        root.getChildren().add(delete);
        root.getChildren().add(minus);
        root.getChildren().add(calculate);
        root.getChildren().add(retrieve);
        root.getChildren().add(goBack);
        root.setStyle("-fx-background-color: #5c615f;");

        Scene scene = new Scene(root, 533, 395);
        Stage window = new Stage();
        window.setScene(scene);
        window.show();

        goBack.setOnAction(event -> {
            window.close();
        });
    }
}
