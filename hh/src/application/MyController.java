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
        String text = text1.getText();//获取文本框输入的内容
        System.out.println(text);
    }
	
}
