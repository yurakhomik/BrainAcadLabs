package application;

import java.net.URL;
import java.util.ResourceBundle;

import application.Model.Calculator;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class Controller implements Initializable{
	
	@FXML
	Label result;
	
	@FXML
	TextField value1;
	
	@FXML
	TextField value2;
	
	@FXML
	Button addition;
	
	@FXML
	Button subtraction;
	
	@FXML
	Button multiplisity;
	
	@FXML
	Button division;
	
	@FXML
	Model.Calculator<Integer> model;
	
	public void additionOnAction() {
		if (value1.getText().length() > 0 && value2.getText().length() > 0) {
			Integer value1 = Integer.valueOf(this.value1.getText());
			Integer value2 = Integer.valueOf(this.value2.getText());
			Integer calcResult =  model.add.execute(value1, value2);
			result.setText(calcResult.toString());
		}
		
		
	}
	
	public void subtractionOnAction() {
		if (value1.getText().length() > 0 && value2.getText().length() > 0) {
			Integer value1 = Integer.valueOf(this.value1.getText());
			Integer value2 = Integer.valueOf(this.value2.getText());
			Integer calcResult =  model.substractions.execute(value1, value2);
			result.setText(calcResult.toString());
		}
		
	}
	
	public void multiplisityOnAction() {
		if (value1.getText().length() > 0 && value2.getText().length() > 0) {
			Integer value1 = Integer.valueOf(this.value1.getText());
			Integer value2 = Integer.valueOf(this.value2.getText());
			Integer calcResult =  model.multiplisity.execute(value1, value2);
			result.setText(calcResult.toString());
		}
		
	}
	
	public void devisionOnAction() {
		if (value1.getText().length() > 0 && value2.getText().length() > 0) {
			Integer value1 = Integer.valueOf(this.value1.getText());
			Integer value2 = Integer.valueOf(this.value2.getText());
			Integer calcResult = model.devisions.execute(value1, value2);
			result.setText(calcResult.toString());
		}
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resourses) {
		model = new Calculator<>();
	}
	

}
