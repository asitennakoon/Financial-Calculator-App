package sample;

import javafx.scene.control.TextField;

public class Keyboard {

    //This variable is used to store the text field which currently has the cursor point.
    public TextField selectedTextField;

    //This method loops through all the text fields in particular calculator and set the focused text field to the selectedTextField variable.
    public void installListener(TextField... textFields) {
        for (TextField textField : textFields) {
            textField.focusedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue) {
                    selectedTextField = textField;
                }
            });
        }
    }
}
