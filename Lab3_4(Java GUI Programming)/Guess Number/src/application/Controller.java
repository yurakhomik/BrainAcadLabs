package application;

import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

	@FXML
	Button button1;

	@FXML
	Button button2;

	@FXML
	Label label;

	@FXML
	TextField textField;

	public void verifyOnAction() {
		Random random = new Random();
		int a = random.nextInt(10);
		try {
		Integer b = Integer.valueOf(textField.getText());
		if (a == b)
			label.setText("Congratulations!You guessed the number :)");
		else
			label.setText("Try again!");
		} catch(RuntimeException e) {
			label.setText("Please, enter number!");
			
		}

	}

	public void randomyOnAction() {
		verifyOnAction();
		textField.setText("");
		label.setText("Guess other number!");

	}

}
