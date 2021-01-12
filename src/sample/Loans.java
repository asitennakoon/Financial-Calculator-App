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

public class Loans {

    public static void loans() {
        Label lblLoan = new Label("Loan Amount :");
        lblLoan.setLayoutX(70);
        lblLoan.setLayoutY(97);
        lblLoan.setMinWidth(97);
        lblLoan.setMinHeight(17);
        lblLoan.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        lblLoan.setStyle("-fx-text-fill: #1cc9c7;");
        TextField tfLoan = new TextField();
        tfLoan.setLayoutX(190);
        tfLoan.setLayoutY(94);
        tfLoan.setMaxWidth(97);
        tfLoan.setMinHeight(25);
        tfLoan.setStyle("-fx-background-radius: 20;");

        Label lblInterest = new Label("Interest Rate :");
        lblInterest.setLayoutX(75);
        lblInterest.setLayoutY(140);
        lblInterest.setMinWidth(89);
        lblInterest.setMinHeight(17);
        lblInterest.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        lblInterest.setStyle("-fx-text-fill: #1cc9c7;");
        TextField tfInterest = new TextField();
        tfInterest.setLayoutX(190);
        tfInterest.setLayoutY(137);
        tfInterest.setMaxWidth(97);
        tfInterest.setMinHeight(25);
        tfInterest.setStyle("-fx-background-radius: 20;");

        Label lblNum = new Label("Number of Payments :");
        lblNum.setLayoutX(20);
        lblNum.setLayoutY(183);
        lblNum.setMinWidth(105);
        lblNum.setMinHeight(17);
        lblNum.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        lblNum.setStyle("-fx-text-fill: #1cc9c7;");
        TextField tfNum = new TextField();
        tfNum.setLayoutX(190);
        tfNum.setLayoutY(180);
        tfNum.setMaxWidth(97);
        tfNum.setMinHeight(25);
        tfNum.setStyle("-fx-background-radius: 20;");

        Label lblPayment = new Label("Monthly Payment :");
        lblPayment.setLayoutX(45);
        lblPayment.setLayoutY(226);
        lblPayment.setMinWidth(42);
        lblPayment.setMinHeight(17);
        lblPayment.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        lblPayment.setStyle("-fx-text-fill: #1cc9c7;");
        TextField tfPayment = new TextField();
        tfPayment.setLayoutX(190);
        tfPayment.setLayoutY(223);
        tfPayment.setMaxWidth(97);
        tfPayment.setMinHeight(25);
        tfPayment.setStyle("-fx-background-radius: 20;");

        Separator separator = new Separator();
        separator.setOrientation(Orientation.VERTICAL);
        separator.setLayoutX(328);
        separator.setLayoutY(74);
        separator.setMinHeight(193);
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
        calculate.setLayoutY(306);
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

        File file = new File("LoanRecords.txt");

        calculate.setOnAction(event -> {
            try {
                final double compounds = 12;
                String interest = tfInterest.getText();
                double interestRate = Double.parseDouble(interest) / 100.0;
                if (tfLoan.getText().isEmpty()) {
                    String num = tfNum.getText();
                    String payment = tfPayment.getText();
                    double P = (Double.parseDouble(payment) / (interestRate / compounds)) * (1 - (1 / Math.pow(1 + (interestRate / compounds), Double.parseDouble(num))));
                    tfLoan.setText("" + Math.round(P * 100.0) / 100.0);
                } else if (tfNum.getText().isEmpty()) {
                    String loan = tfLoan.getText();
                    String payment = tfPayment.getText();
                    double t = Math.log((Double.parseDouble(payment) / (interestRate / compounds)) / (Double.parseDouble(payment) / (interestRate / compounds) - Double.parseDouble(loan))) / Math.log(1 + (interestRate / compounds));
                    tfNum.setText("" + Math.round(t));
                } else if (tfPayment.getText().isEmpty()) {
                    String loan = tfLoan.getText();
                    String num = tfNum.getText();
                    double PMT = (Double.parseDouble(loan) * (interestRate / compounds) * Math.pow(1 + (interestRate / compounds), Double.parseDouble(num))) / (Math.pow(1 + (interestRate / compounds), Double.parseDouble(num)) - 1);
                    tfPayment.setText("" + Math.round(PMT * 100.0) / 100.0);
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
                printWriter.println(tfLoan.getText());
                printWriter.println(tfInterest.getText());
                printWriter.println(tfNum.getText());
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
            TextField[] textFields = {tfLoan, tfInterest, tfNum, tfPayment};
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
        keyboard.installListener(tfLoan, tfInterest, tfNum, tfPayment);

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
        root.getChildren().add(lblLoan);
        root.getChildren().add(tfLoan);
        root.getChildren().add(lblInterest);
        root.getChildren().add(tfInterest);
        root.getChildren().add(lblNum);
        root.getChildren().add(tfNum);
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
