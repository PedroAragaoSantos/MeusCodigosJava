package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SomarController {

    @FXML
    private Button btnFechar;

    @FXML
    private Button btnLimpar;

    @FXML
    private Button btnSomar;

    @FXML
    private Label lblnumero1;

    @FXML
    private Label lblnumero2;

    @FXML
    private Label lblresultado;

    @FXML
    private Label lblsoma;

    @FXML
    private TextField txtnumero1;

    @FXML
    private TextField txtnumero2;

    @FXML
    void onClickBtnFechar(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void onClickBtnLimpar(ActionEvent event) {
txtnumero1.setText("");
txtnumero2.setText("");
lblsoma.setText("");
txtnumero1.requestFocus();
    }

    @FXML
    void onClickBtnSomar(ActionEvent event) {
        try{
Double numero1 = Double.valueOf(txtnumero1.getText());
Double numero2 = Double.valueOf(txtnumero2.getText());
Double soma = numero1 + numero2;
lblsoma.setText(soma.toString());
    }catch(NumberFormatException n){
            System.out.println("Número Inválido!");
    }

}
}
