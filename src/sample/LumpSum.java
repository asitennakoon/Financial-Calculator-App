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

public class LumpSum {

    public static void lumpSum() {

        Label lblInterest = new Label("Interest Rate :");
        lblInterest.setLayoutX(59);
        lblInterest.setLayoutY(97);
        lblInterest.setMinWidth(97);
        lblInterest.setMinHeight(17);
        lblInterest.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        lblInterest.setStyle("-fx-text-fill: #1cc9c7;");
        TextField tfInterest = new TextField();
        tfInterest.setLayoutX(190);
        tfInterest.setLayoutY(94);
        tfInterest.setMaxWidth(97);
        tfInterest.setMinHeight(25);
        tfInterest.setStyle("-fx-background-radius: 20;");

        Label lblFinal = new Label("Final Value :");
        lblFinal.setLayoutX(70);
        lblFinal.setLayoutY(140);
        lblFinal.setMinWidth(89);
        lblFinal.setMinHeight(17);
        lblFinal.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        lblFinal.setStyle("-fx-text-fill: #1cc9c7;");
        TextField tfFinal = new TextField();
        tfFinal.setLayoutX(190);
        tfFinal.setLayoutY(137);
        tfFinal.setMaxWidth(97);
        tfFinal.setMinHeight(25);
        tfFinal.setStyle("-fx-background-radius: 20;");

        Label lblPresent = new Label("Present Value :");
        lblPresent.setLayoutX(52);
        lblPresent.setLayoutY(183);
        lblPresent.setMinWidth(105);
        lblPresent.setMinHeight(17);
        lblPresent.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        lblPresent.setStyle("-fx-text-fill: #1cc9c7;");
        TextField tfPresent = new TextField();
        tfPresent.setLayoutX(190);
        tfPresent.setLayoutY(180);
        tfPresent.setMaxWidth(97);
        tfPresent.setMinHeight(25);
        tfPresent.setStyle("-fx-background-radius: 20;");

        Label lblTime = new Label("Time :");
        lblTime.setLayoutX(112);
        lblTime.setLayoutY(226);
        lblTime.setMinWidth(42);
        lblTime.setMinHeight(17);
        lblTime.setFont(Font.font("SansSerif", FontWeight.BOLD, 14));
        lblTime.setStyle("-fx-text-fill: #1cc9c7;");
        TextField tfTime = new TextField();
        tfTime.setLayoutX(190);
        tfTime.setLayoutY(223);
        tfTime.setMaxWidth(97);
        tfTime.setMinHeight(25);
        tfTime.setStyle("-fx-background-radius: 20;");

        Separator separator = new Separator();
        separator.setOrientation(Orientation.VERTICAL);
        separator.setLayoutX(328);
        separator.setLayoutY(74);
        separator.setMinHeight(193);
        separator.setMinWidth(5);

        //Buttons for the onscreen keyboard
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

        //Button to repopulate data from the file
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

        //File which input values are stored. Each calculator has its' own file for convenience.
        File file = new File("LumpSumRecords.txt");

        calculate.setOnAction(event -> {
            //There can be many ways NumberFormatException be occurred in these scenarios. Therefore, try and block method is used to handle it.
            try {
                final double compounds = 12;
                //isEmpty() method is used to figure out what parameter user wants to estimate.
                //All the values in text fields has to be converted to doubles to carry out calculations.
                if (tfInterest.getText().isEmpty()) {
                    String futureValue = tfFinal.getText();
                    String presentValue = tfPresent.getText();
                    String time = tfTime.getText();
                    double r = compounds * (Math.pow(Double.parseDouble(futureValue) / Double.parseDouble(presentValue), 1 / (compounds * Double.parseDouble(time))) - 1);
                    tfInterest.setText("" + Math.round(r * 100.0));
                } else if (tfFinal.getText().isEmpty()) {
                    String interest = tfInterest.getText();
                    String presentValue = tfPresent.getText();
                    String time = tfTime.getText();
                    double interestRate = Double.parseDouble(interest) / 100.0;
                    double A = Double.parseDouble(presentValue) * Math.pow(1 + interestRate / compounds, compounds * Double.parseDouble(time));
                    tfFinal.setText("" + Math.round(A * 100.0) / 100.0);
                } else if (tfPresent.getText().isEmpty()) {
                    String interest = tfInterest.getText();
                    String futureValue = tfFinal.getText();
                    String time = tfTime.getText();
                    double interestRate = Double.parseDouble(interest) / 100.0;
                    double P = Double.parseDouble(futureValue) / Math.pow(1 + interestRate / compounds, compounds * Double.parseDouble(time));
                    tfPresent.setText("" + Math.round(P * 100.0) / 100.0);
                } else if (tfTime.getText().isEmpty()) {
                    String interest = tfInterest.getText();
                    String futureValue = tfFinal.getText();
                    String presentValue = tfPresent.getText();
                    double interestRate = Double.parseDouble(interest) / 100.0;
                    double t = Math.log(Double.parseDouble(futureValue) / Double.parseDouble(presentValue)) / (compounds * Math.log(1 + interestRate / compounds));
                    tfTime.setText("" + Math.round(t));
                }
                //Alert box would pop up describing the error for the ease of the user.
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
                //Append parameter is set to false because then latest values would be on top of the file instead printing one after the other.
                //Therefore, latest values can be easily retrieved by Scanner object.
                fileWriter = new FileWriter(file);
                printWriter = new PrintWriter(fileWriter, true);
                printWriter.println(tfInterest.getText());
                printWriter.println(tfFinal.getText());
                printWriter.println(tfPresent.getText());
                printWriter.println(tfTime.getText() + "\n");
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
            //All the text fields were added to an array. In order, the values which are in the file were set to them in a loop.
            TextField[] textFields = {tfInterest, tfFinal, tfPresent, tfTime};
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

        //A Keyboard object is created and all the text fields are added as arguments for the installListener method
        //which is used to find the focused text field. That text field is the one which would get inputs from the onscreen keyboard.
        Keyboard keyboard = new Keyboard();
        keyboard.installListener(tfInterest, tfFinal, tfPresent, tfTime);

        //All the buttons on the onscreen keyboard has Action events to append text to a focused text field.
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
        //Delete button would get the value in a text field and set it again, but only from the first index of the value to one before last.
        //This is the same as removing the last index of a string.
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
