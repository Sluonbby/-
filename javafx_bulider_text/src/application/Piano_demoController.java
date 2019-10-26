package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
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
	@FXML
	private ImageView black1;
	@FXML
	private ImageView black2;
	@FXML
	private Pane pane;

	public void click(File file, ImageView a, ImageView b) {
		media = new Media(file.toURI().toString());
		mplayer = new MediaPlayer(media);
		a.setVisible(false); 
		b.setVisible(true);
		mplayer.play();
		//System.out.println("Click A");
	}
	
	public void release(ImageView b, ImageView a) {
		b.setVisible(false);
		a.setVisible(true);
	}
	
	public void press_Clicked(KeyEvent event) {
		if(event.getCode() == KeyCode.Q){
			File file = new File("a48.mp3");
			click(file, white1, white2);
		}
		if(event.getCode() == KeyCode.DIGIT7){
			File file = new File("a48.mp3");
			click(file, black1, black2);
		}
		
	

	}
	
	public void press_Released(KeyEvent event) {
		if(event.getCode() == KeyCode.Q){
			release(white2, white1);
		}
		if(event.getCode() == KeyCode.DIGIT2){
			release(black2, black1);
		}

	}

}
 