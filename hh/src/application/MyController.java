package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

public class MyController {
	@FXML
	private Button bt1;
	@FXML
	private TextField text1;

	public void eventButton(){
        String text = text1.getText();//��ȡ�ı������������
        System.out.println(text);
    }
	
}
