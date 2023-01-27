package application;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Screen1Controller implements Initializable {

	@FXML Label lblText, lblSum;
	@FXML Button btnSecond, btnChange, btnClose,btnCal;
	@FXML TextField txtPer,txtPrice;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
 public void btnSecondAction(ActionEvent event) {
	 
 
	 try {
		 Parent root = FXMLLoader.load(getClass().getResource("Screen2.fxml"));
			Stage stage = new Stage();
			stage.setTitle("change screen");
			stage.setScene(new Scene(root,600,400));
			stage.show();
	 }catch(Exception e) {
			e.printStackTrace();
		}
 }
 public void btnChangeAction(ActionEvent event) {
	 lblText.setText("스마트웹콘텐츠과");
	 btnClose.setText("닥");
 }
public void btnCloseAction(ActionEvent event) {
	 Stage stage =(Stage)btnClose.getScene().getWindow();
	 stage.close();
 }
public void btnCalAction(ActionEvent event) {
	//String tmpPer = txtPer.getText();
	//int tmpPer1 = Integer.parseInt(txtPer.getText());
	
	//String tmpPer2 = String.valueOf(tmpPer1);
	int tmpPer = Integer.parseInt(txtPer.getText());
	int tmpPrice = Integer.parseInt(txtPrice.getText());
	MulModel model =new MulModel();
	DecimalFormat df= new DecimalFormat("#,###");
	int tmpSum = model.mul(tmpPer,tmpPrice);
	lblSum.setText(String.valueOf(tmpSum));
}

}
