package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

public class Piano_demoController {
	@FXML
	private Button bt1;
	@FXML
	private TextField tf1;
	
	public void eventButton(){
        String text = tf1.getText();//��ȡ�ı������������
        System.out.println(text);
    }

}
