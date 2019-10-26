package application;

import java.io.File;

import javafx.fxml.FXML;

import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class PianoController {
	@FXML
	private Pane pane;
	@FXML
	private ImageView c1p;
	@FXML
	private ImageView c1u;
	@FXML
	private ImageView c2p;
	@FXML
	private ImageView c3p;
	@FXML
	private ImageView c4p;
	@FXML
	private ImageView c5p;
	@FXML
	private ImageView c6p;
	@FXML
	private ImageView c7p;
	@FXML
	private ImageView d1p;
	@FXML
	private ImageView d2p;
	@FXML
	private ImageView d3p;
	@FXML
	private ImageView d4p;
	@FXML
	private ImageView d5p;
	@FXML
	private ImageView d6p;
	@FXML
	private ImageView d7p;
	@FXML
	private ImageView c2u;
	@FXML
	private ImageView c3u;
	@FXML
	private ImageView c4u;
	@FXML
	private ImageView c5u;
	@FXML
	private ImageView c6u;
	@FXML
	private ImageView c7u;
	@FXML
	private ImageView d1u;
	@FXML
	private ImageView d2u;
	@FXML
	private ImageView d3u;
	@FXML
	private ImageView d4u;
	@FXML
	private ImageView d5u;
	@FXML
	private ImageView d6u;
	@FXML
	private ImageView d7u;
	@FXML
	private ImageView c1xp;
	@FXML
	private ImageView c4xp;
	@FXML
	private ImageView c2xp;
	@FXML
	private ImageView d1xp;
	@FXML
	private ImageView c6xp;
	@FXML
	private ImageView c5xp;
	@FXML
	private ImageView d5xp;
	@FXML
	private ImageView d4xp;
	@FXML
	private ImageView d2xp;
	@FXML
	private ImageView d6xp;
	@FXML
	private ImageView d6xu;
	@FXML
	private ImageView d5xu;
	@FXML
	private ImageView d4xu;
	@FXML
	private ImageView d2xu;
	@FXML
	private ImageView d1xu;
	@FXML
	private ImageView c6xu;
	@FXML
	private ImageView c5xu;
	@FXML
	private ImageView c2xu;
	@FXML
	private ImageView c1xu;
	@FXML
	private ImageView c4xu;
	@FXML
	private Media media;
	@FXML
	private MediaPlayer mplayer;
	
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
	
	public void press_A_Clicked(KeyEvent event) {
		if(event.getCode() == KeyCode.A){
			File file = new File("a48.mp3");
			click(file, c1u, c1p);
			
		}
		
	

	}
	
	public void press_A_Released(KeyEvent event) {
		if(event.getCode() == KeyCode.A){
			release(c1p, c1u);
		}

	}
}
