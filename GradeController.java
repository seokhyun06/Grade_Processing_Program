package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class GradeController implements Initializable {
	@FXML Button btnSum,btnAvg;
	@FXML Label lblName, lblKor, lblEng, lblSum, lblAvg;
	@FXML TextField txtName, txtKor, txtEng;
	gradeModel gm = new gradeModel();
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	public void btnSumAction(ActionEvent event) {
		
		lblSum.setText(gm.Sum(txtKor.getText(),txtEng.getText()));
	}
	public void btnAvgAction(ActionEvent event) {
		lblAvg.setText(gm.Avg(txtKor.getText(),txtEng.getText()));
	}
}
