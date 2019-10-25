package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class Piano_demoController {
	@FXML
	private ImageView white1;
	@FXML
	private TextField tf1;
	@FXML
	private ImageView white2;
	@FXML
	private Button bt1;
	@FXML
	private Media media;
	@FXML
	private MediaPlayer mplayer;
	

	public void press_Q_Clicked(KeyEvent event) {
		if(event.getCode() == KeyCode.Q){
			tf1.setText("Click Q");
			File file = new java.io.File("a48.mp3");
			media = new Media(file.toURI().toString());
			mplayer = new MediaPlayer(media);
			white1.setVisible(false);
			white2.setVisible(true);
			mplayer.play();
			String text = tf1.getText();
			System.out.println(text);
		}

	}
	
	public void press_Q_Released(KeyEvent event) {
		if(event.getCode() == KeyCode.Q){
			tf1.setText("Release Q");
			white2.setVisible(false);
			white1.setVisible(true);
			String text = tf1.getText();
			System.out.println(text);
		}

	}

}
 