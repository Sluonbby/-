package application;

import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;


public class Piano_demoController {
	@FXML
	private Button bt1;
	@FXML
	private TextField tf1;
	@FXML
	private Button bt2;
	@FXML
	private ToggleButton tbt1;

	public void press_A() {
		
		tbt1.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				if(event.getCode() == KeyCode.Q){
					//MouseEvent e = null;
					//e.getButton();
//					if(bt1.isDisable()) {
//						bt1.setDisable(false);
//					}
//					else {
//						bt1.setDisable(true);
//					}
					

					String text = tf1.getText();//获取文本框输入的内容
					System.out.println(text);

				}
				
			}
			
		});
		
	}
	
	public void changed(Observable o) {
	    
	}
	
	public void press_a(MouseEvent event) {
		
		if(event.getButton() != null){
			tbt1.setSelected(true);
			String text = tf1.getText();//获取文本框输入的内容
			System.out.println(text);
		}
	}
	
	
	public void eventButton(){
		String text = tf1.getText();//获取文本框输入的内容
		System.out.println(text);
	}



}
 