package application;

import java.io.File;
import java.io.FileOutputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.TargetDataLine;

import javafx.fxml.FXML;

import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class Piano_demoController {
	@FXML
	private Pane pane;
	@FXML
	private ImageView white2;
	@FXML
	private ImageView white4;
	@FXML
	private ImageView white6;
	@FXML
	private ImageView white16;
	@FXML
	private ImageView white14;
	@FXML
	private ImageView white12;
	@FXML
	private ImageView white10;
	@FXML
	private ImageView white8;
	@FXML
	private ImageView white26;
	@FXML
	private ImageView white24;
	@FXML
	private ImageView white22;
	@FXML
	private ImageView white20;
	@FXML
	private ImageView white18;
	@FXML
	private ImageView white28;
	@FXML
	private ImageView white1;
	@FXML
	private ImageView white3;
	@FXML
	private ImageView white5;
	@FXML
	private ImageView white7;
	@FXML
	private ImageView white9;
	@FXML
	private ImageView white11;
	@FXML
	private ImageView white13;
	@FXML
	private ImageView white15;
	@FXML
	private ImageView white17;
	@FXML
	private ImageView white19;
	@FXML
	private ImageView white21;
	@FXML
	private ImageView white23;
	@FXML
	private ImageView white25;
	@FXML
	private ImageView white27;
	@FXML
	private ImageView black2;
	@FXML
	private ImageView black4;
	@FXML
	private ImageView black6;
	@FXML
	private ImageView black8;
	@FXML
	private ImageView black10;
	@FXML
	private ImageView black12;
	@FXML
	private ImageView black14;
	@FXML
	private ImageView black16;
	@FXML
	private ImageView black18;
	@FXML
	private ImageView black20;
	@FXML
	private ImageView black1;
	@FXML
	private ImageView black3;
	@FXML
	private ImageView black5;
	@FXML
	private ImageView black7;
	@FXML
	private ImageView black9;
	@FXML
	private ImageView black11;
	@FXML
	private ImageView black13;
	@FXML
	private ImageView black15;
	@FXML
	private ImageView black17;
	@FXML
	private ImageView black19;
	@FXML
	private ImageView pa;
	@FXML
	private ImageView pc;
	@FXML
	private ImageView pd;
	@FXML
	private ImageView pe;
	@FXML
	private ImageView pf;
	@FXML
	private ImageView pb;
	@FXML
	private Media media;
	@FXML
	private MediaPlayer mplayer;
	private int n = 3;
	public void click(File file, ImageView a, ImageView b) {
		media = new Media(file.toURI().toString());
		mplayer = new MediaPlayer(media);
		//Duration duration = new Duration(1000);
		//mplayer.seek(duration);
		//mplayer.setStopTime(duration);
		a.setVisible(false); 
		b.setVisible(true);
		mplayer.play();
		//System.out.println("Click A");
	}
	
	public void release(ImageView b, ImageView a) {
		b.setVisible(false);
		a.setVisible(true);
	}
	@FXML
	public void press_Clicked(KeyEvent event) {
		if(event.getCode() == KeyCode.BACK_SLASH) {
			n++;
			if(n == 2) {pa.setVisible(false);pb.setVisible(true);}
			if(n == 3) {pb.setVisible(false);pc.setVisible(true);}
			if(n == 4) {pc.setVisible(false);pd.setVisible(true);}
			if(n == 5) {pd.setVisible(false);pe.setVisible(true);}
			if(n == 6) {pe.setVisible(false);pf.setVisible(true);}
			if(n > 6)n = 6;
		}
		if(event.getCode() == KeyCode.SHIFT) {
			n--;
			if(n < 1)n = 1;
			if(n == 1) {pb.setVisible(false);pa.setVisible(true);}
			if(n == 2) {pc.setVisible(false);pb.setVisible(true);}
			if(n == 3) {pd.setVisible(false);pc.setVisible(true);}
			if(n == 4) {pe.setVisible(false);pd.setVisible(true);}
			if(n == 5) {pf.setVisible(false);pe.setVisible(true);}
		}
		if(n == 1) {
		    if(event.getCode() == KeyCode.Z){
			   File file = new File("4.mp3");
			   click(file, white1, white2);
			  }
			if(event.getCode() == KeyCode.X){
			   File file = new File("6.mp3");
			   click(file, white3, white4);
			  }
			if(event.getCode() == KeyCode.C){
			   File file = new File("8.mp3");
			   click(file, white5, white6);
			  }
			if(event.getCode() == KeyCode.V){
			   File file = new File("9.mp3");
			   click(file, white7, white8);
			  }
			if(event.getCode() == KeyCode.B){
			   File file = new File("11.mp3");
			   click(file, white9, white10);
			  }
			if(event.getCode() == KeyCode.N){
			   File file = new File("13.mp3");
			   click(file, white11, white12);
			  }
			if(event.getCode() == KeyCode.M){
			   File file = new File("15.mp3");
			   click(file, white13, white14);
			  }
			if(event.getCode() == KeyCode.Y){
			   File file = new File("16.mp3");
			   click(file, white15, white16);
			 }
			if(event.getCode() == KeyCode.U){
			   File file = new File("18.mp3");
			   click(file, white17, white18);
			 }
			if(event.getCode() == KeyCode.I){
			   File file = new File("20.mp3");
			   click(file, white19, white20);
			  }
			if(event.getCode() == KeyCode.O){
			   File file = new File("21.mp3");
			   click(file, white21, white22);
			  }
			if(event.getCode() == KeyCode.P){
			   File file = new File("23.mp3");
			   click(file, white23, white24);
			  }
			if(event.getCode() == KeyCode.OPEN_BRACKET){
			   File file = new File("25.mp3");
			   click(file, white25, white26);
			  }
			if(event.getCode() == KeyCode.CLOSE_BRACKET){
			   File file = new File("27.mp3");
			   click(file, white27, white28);
			  }
				
			if(event.getCode() == KeyCode.S){
				File file = new File("5.mp3");
				click(file, black1, black2);
			}
			if(event.getCode() == KeyCode.D){
				File file = new File("7.mp3");
				click(file, black3, black4);
			}
			if(event.getCode() == KeyCode.G){
				File file = new File("10.mp3");
				click(file, black5, black6);
			}
			if(event.getCode() == KeyCode.H){
				File file = new File("12.mp3");
				click(file, black7, black8);
			}
			if(event.getCode() == KeyCode.J){
				File file = new File("14.mp3");
				click(file, black9, black10);
			}
			if(event.getCode() == KeyCode.DIGIT7){
				File file = new File("17.mp3");
				click(file, black11, black12);
			}
			if(event.getCode() == KeyCode.DIGIT8){
				File file = new File("19.mp3");
				click(file, black13, black14);
			}
			if(event.getCode() == KeyCode.DIGIT0){
				File file = new File("22.mp3");
				click(file, black15, black16);
			}
			if(event.getCode() == KeyCode.SUBTRACT){
				File file = new File("24.mp3");
				click(file, black17, black18);
			}
			if(event.getCode() == KeyCode.EQUALS){
				File file = new File("26.mp3");
				click(file, black19, black20);
			}
		}
		
		if(n == 2) {
			if(event.getCode() == KeyCode.Z){
			   File file = new File("16.mp3");
			   click(file, white1, white2);
			  }
			if(event.getCode() == KeyCode.X){
			   File file = new File("18.mp3");
			   click(file, white3, white4);
			  }
			if(event.getCode() == KeyCode.C){
			   File file = new File("20.mp3");
			   click(file, white5, white6);
			  }
			if(event.getCode() == KeyCode.V){
			   File file = new File("21.mp3");
			   click(file, white7, white8);
			  }
			if(event.getCode() == KeyCode.B){
			   File file = new File("23.mp3");
			   click(file, white9, white10);
			  }
			if(event.getCode() == KeyCode.N){
			   File file = new File("25.mp3");
			   click(file, white11, white12);
			  }
			if(event.getCode() == KeyCode.M){
			   File file = new File("27.mp3");
			   click(file, white13, white14);
			  }
			if(event.getCode() == KeyCode.Y){
			   File file = new File("28.mp3");
			   click(file, white15, white16);
			  }
		    if(event.getCode() == KeyCode.U){
			   File file = new File("30.mp3");
			   click(file, white17, white18);
			  }
			if(event.getCode() == KeyCode.I){
			   File file = new File("32.mp3");
			   click(file, white19, white20);
			  }
			if(event.getCode() == KeyCode.O){
			   File file = new File("33.mp3");
			   click(file, white21, white22);
			  }
			if(event.getCode() == KeyCode.P){
			   File file = new File("35.mp3");
			   click(file, white23, white24);
			  }
			if(event.getCode() == KeyCode.OPEN_BRACKET){
			   File file = new File("37.mp3");
			   click(file, white25, white26);
			  }
			if(event.getCode() == KeyCode.CLOSE_BRACKET){
			   File file = new File("39.mp3");
			   click(file, white27, white28);
			  }
			if(event.getCode() == KeyCode.S){
				File file = new File("17.mp3");
				click(file, black1, black2);
			}
			if(event.getCode() == KeyCode.D){
				File file = new File("19.mp3");
				click(file, black3, black4);
			}
			if(event.getCode() == KeyCode.G){
				File file = new File("22.mp3");
				click(file, black5, black6);
			}
			if(event.getCode() == KeyCode.H){
				File file = new File("24.mp3");
				click(file, black7, black8);
			}
			if(event.getCode() == KeyCode.J){
				File file = new File("26.mp3");
				click(file, black9, black10);
			}
			if(event.getCode() == KeyCode.DIGIT7){
				File file = new File("29.mp3");
				click(file, black11, black12);
			}
			if(event.getCode() == KeyCode.DIGIT8){
				File file = new File("31.mp3");
				click(file, black13, black14);
			}
			if(event.getCode() == KeyCode.DIGIT0){
				File file = new File("34.mp3");
				click(file, black15, black16);
			}
			if(event.getCode() == KeyCode.SUBTRACT){
				File file = new File("36.mp3");
				click(file, black17, black18);
			}
			if(event.getCode() == KeyCode.EQUALS){
				File file = new File("38.mp3");
				click(file, black19, black20);
			}
			
		}
		if(n == 3) {
			if(event.getCode() == KeyCode.Z){
			   File file = new File("28.mp3");
			   click(file, white1, white2);
			  }
			if(event.getCode() == KeyCode.X){
			   File file = new File("30.mp3");
			   click(file, white3, white4);
			  }
			if(event.getCode() == KeyCode.C){
			   File file = new File("32.mp3");
			   click(file, white5, white6);
			  }
			if(event.getCode() == KeyCode.V){
			   File file = new File("33.mp3");
			   click(file, white7, white8);
			  }
			if(event.getCode() == KeyCode.B){
			   File file = new File("35.mp3");
			   click(file, white9, white10);
			  }
			if(event.getCode() == KeyCode.N){
			   File file = new File("37.mp3");
			   click(file, white11, white12);
			  }
			if(event.getCode() == KeyCode.M){
			   File file = new File("39.mp3");
			   click(file, white13, white14);
			  }
			if(event.getCode() == KeyCode.Y){
			   File file = new File("40.mp3");
			   click(file, white15, white16);
			  }
		    if(event.getCode() == KeyCode.U){
			   File file = new File("42.mp3");
			   click(file, white17, white18);
			  }
			if(event.getCode() == KeyCode.I){
			   File file = new File("44.mp3");
			   click(file, white19, white20);
			  }
			if(event.getCode() == KeyCode.O){
			   File file = new File("45.mp3");
			   click(file, white21, white22);
			  }
			if(event.getCode() == KeyCode.P){
			   File file = new File("47.mp3");
			   click(file, white23, white24);
			  }
			if(event.getCode() == KeyCode.OPEN_BRACKET){
			   File file = new File("49.mp3");
			   click(file, white25, white26);
			  }
			if(event.getCode() == KeyCode.CLOSE_BRACKET){
			   File file = new File("51.mp3");
			   click(file, white27, white28);
			  }
			if(event.getCode() == KeyCode.S){
				File file = new File("29.mp3");
				click(file, black1, black2);
			}
			if(event.getCode() == KeyCode.D){
				File file = new File("31.mp3");
				click(file, black3, black4);
			}
			if(event.getCode() == KeyCode.G){
				File file = new File("34.mp3");
				click(file, black5, black6);
			}
			if(event.getCode() == KeyCode.H){
				File file = new File("36.mp3");
				click(file, black7, black8);
			}
			if(event.getCode() == KeyCode.J){
				File file = new File("38.mp3");
				click(file, black9, black10);
			}
			if(event.getCode() == KeyCode.DIGIT7){
				File file = new File("41.mp3");
				click(file, black11, black12);
			}
			if(event.getCode() == KeyCode.DIGIT8){
				File file = new File("43.mp3");
				click(file, black13, black14);
			}
			if(event.getCode() == KeyCode.DIGIT0){
				File file = new File("46.mp3");
				click(file, black15, black16);
			}
			if(event.getCode() == KeyCode.SUBTRACT){
				File file = new File("48.mp3");
				click(file, black17, black18);
			}
			if(event.getCode() == KeyCode.EQUALS){
				File file = new File("50.mp3");
				click(file, black19, black20);
			}
			
		}
		if(n == 4) {
			if(event.getCode() == KeyCode.Z){
			   File file = new File("40.mp3");
			   click(file, white1, white2);
			  }
			if(event.getCode() == KeyCode.X){
			   File file = new File("42.mp3");
			   click(file, white3, white4);
			  }
			if(event.getCode() == KeyCode.C){
			   File file = new File("44.mp3");
			   click(file, white5, white6);
			  }
			if(event.getCode() == KeyCode.V){
			   File file = new File("45.mp3");
			   click(file, white7, white8);
			  }
			if(event.getCode() == KeyCode.B){
			   File file = new File("47.mp3");
			   click(file, white9, white10);
			  }
			if(event.getCode() == KeyCode.N){
			   File file = new File("49.mp3");
			   click(file, white11, white12);
			  }
			if(event.getCode() == KeyCode.M){
			   File file = new File("51.mp3");
			   click(file, white13, white14);
			  }
			if(event.getCode() == KeyCode.Y){
			   File file = new File("52.mp3");
			   click(file, white15, white16);
			  }
		    if(event.getCode() == KeyCode.U){
			   File file = new File("54.mp3");
			   click(file, white17, white18);
			  }
			if(event.getCode() == KeyCode.I){
			   File file = new File("56.mp3");
			   click(file, white19, white20);
			  }
			if(event.getCode() == KeyCode.O){
			   File file = new File("57.mp3");
			   click(file, white21, white22);
			  }
			if(event.getCode() == KeyCode.P){
			   File file = new File("59.mp3");
			   click(file, white23, white24);
			  }
			if(event.getCode() == KeyCode.OPEN_BRACKET){
			   File file = new File("61.mp3");
			   click(file, white25, white26);
			  }
			if(event.getCode() == KeyCode.CLOSE_BRACKET){
			   File file = new File("63.mp3");
			   click(file, white27, white28);
			  }
			if(event.getCode() == KeyCode.S){
				File file = new File("41.mp3");
				click(file, black1, black2);
			}
			if(event.getCode() == KeyCode.D){
				File file = new File("43.mp3");
				click(file, black3, black4);
			}
			if(event.getCode() == KeyCode.G){
				File file = new File("46.mp3");
				click(file, black5, black6);
			}
			if(event.getCode() == KeyCode.H){
				File file = new File("48.mp3");
				click(file, black7, black8);
			}
			if(event.getCode() == KeyCode.J){
				File file = new File("50.mp3");
				click(file, black9, black10);
			}
			if(event.getCode() == KeyCode.DIGIT7){
				File file = new File("53.mp3");
				click(file, black11, black12);
			}
			if(event.getCode() == KeyCode.DIGIT8){
				File file = new File("55.mp3");
				click(file, black13, black14);
			}
			if(event.getCode() == KeyCode.DIGIT0){
				File file = new File("58.mp3");
				click(file, black15, black16);
			}
			if(event.getCode() == KeyCode.SUBTRACT){
				File file = new File("60.mp3");
				click(file, black17, black18);
			}
			if(event.getCode() == KeyCode.EQUALS){
				File file = new File("62.mp3");
				click(file, black19, black20);
			}
			
		}
		if(n == 5) {
			if(event.getCode() == KeyCode.Z){
			   File file = new File("52.mp3");
			   click(file, white1, white2);
			  }
			if(event.getCode() == KeyCode.X){
			   File file = new File("54.mp3");
			   click(file, white3, white4);
			  }
			if(event.getCode() == KeyCode.C){
			   File file = new File("56.mp3");
			   click(file, white5, white6);
			  }
			if(event.getCode() == KeyCode.V){
			   File file = new File("57.mp3");
			   click(file, white7, white8);
			  }
			if(event.getCode() == KeyCode.B){
			   File file = new File("59.mp3");
			   click(file, white9, white10);
			  }
			if(event.getCode() == KeyCode.N){
			   File file = new File("61.mp3");
			   click(file, white11, white12);
			  }
			if(event.getCode() == KeyCode.M){
			   File file = new File("63.mp3");
			   click(file, white13, white14);
			  }
			if(event.getCode() == KeyCode.Y){
			   File file = new File("64.mp3");
			   click(file, white15, white16);
			  }
		    if(event.getCode() == KeyCode.U){
			   File file = new File("66.mp3");
			   click(file, white17, white18);
			  }
			if(event.getCode() == KeyCode.I){
			   File file = new File("68.mp3");
			   click(file, white19, white20);
			  }
			if(event.getCode() == KeyCode.O){
			   File file = new File("69.mp3");
			   click(file, white21, white22);
			  }
			if(event.getCode() == KeyCode.P){
			   File file = new File("71.mp3");
			   click(file, white23, white24);
			  }
			if(event.getCode() == KeyCode.OPEN_BRACKET){
			   File file = new File("73.mp3");
			   click(file, white25, white26);
			  }
			if(event.getCode() == KeyCode.CLOSE_BRACKET){
			   File file = new File("75.mp3");
			   click(file, white27, white28);
			  }
			if(event.getCode() == KeyCode.S){
				File file = new File("53.mp3");
				click(file, black1, black2);
			}
			if(event.getCode() == KeyCode.D){
				File file = new File("55.mp3");
				click(file, black3, black4);
			}
			if(event.getCode() == KeyCode.G){
				File file = new File("58.mp3");
				click(file, black5, black6);
			}
			if(event.getCode() == KeyCode.H){
				File file = new File("60.mp3");
				click(file, black7, black8);
			}
			if(event.getCode() == KeyCode.J){
				File file = new File("62.mp3");
				click(file, black9, black10);
			}
			if(event.getCode() == KeyCode.DIGIT7){
				File file = new File("65.mp3");
				click(file, black11, black12);
			}
			if(event.getCode() == KeyCode.DIGIT8){
				File file = new File("67.mp3");
				click(file, black13, black14);
			}
			if(event.getCode() == KeyCode.DIGIT0){
				File file = new File("70.mp3");
				click(file, black15, black16);
			}
			if(event.getCode() == KeyCode.SUBTRACT){
				File file = new File("72.mp3");
				click(file, black17, black18);
			}
			if(event.getCode() == KeyCode.EQUALS){
				File file = new File("74.mp3");
				click(file, black19, black20);
			}
			
		}
		if(n == 6) {
			if(event.getCode() == KeyCode.Z){
			   File file = new File("64.mp3");
			   click(file, white1, white2);
			  }
			if(event.getCode() == KeyCode.X){
			   File file = new File("66.mp3");
			   click(file, white3, white4);
			  }
			if(event.getCode() == KeyCode.C){
			   File file = new File("68.mp3");
			   click(file, white5, white6);
			  }
			if(event.getCode() == KeyCode.V){
			   File file = new File("69.mp3");
			   click(file, white7, white8);
			  }
			if(event.getCode() == KeyCode.B){
			   File file = new File("71.mp3");
			   click(file, white9, white10);
			  }
			if(event.getCode() == KeyCode.N){
			   File file = new File("73.mp3");
			   click(file, white11, white12);
			  }
			if(event.getCode() == KeyCode.M){
			   File file = new File("75.mp3");
			   click(file, white13, white14);
			  }
			if(event.getCode() == KeyCode.Y){
			   File file = new File("76.mp3");
			   click(file, white15, white16);
			  }
		    if(event.getCode() == KeyCode.U){
			   File file = new File("78.mp3");
			   click(file, white17, white18);
			  }
			if(event.getCode() == KeyCode.I){
			   File file = new File("80.mp3");
			   click(file, white19, white20);
			  }
			if(event.getCode() == KeyCode.O){
			   File file = new File("81.mp3");
			   click(file, white21, white22);
			  }
			if(event.getCode() == KeyCode.P){
			   File file = new File("83.mp3");
			   click(file, white23, white24);
			  }
			if(event.getCode() == KeyCode.OPEN_BRACKET){
			   File file = new File("85.mp3");
			   click(file, white25, white26);
			  }
			if(event.getCode() == KeyCode.CLOSE_BRACKET){
			   File file = new File("87.mp3");
			   click(file, white27, white28);
			  }
			if(event.getCode() == KeyCode.S){
				File file = new File("65.mp3");
				click(file, black1, black2);
			}
			if(event.getCode() == KeyCode.D){
				File file = new File("67.mp3");
				click(file, black3, black4);
			}
			if(event.getCode() == KeyCode.G){
				File file = new File("70.mp3");
				click(file, black5, black6);
			}
			if(event.getCode() == KeyCode.H){
				File file = new File("72.mp3");
				click(file, black7, black8);
			}
			if(event.getCode() == KeyCode.J){
				File file = new File("74.mp3");
				click(file, black9, black10);
			}
			if(event.getCode() == KeyCode.DIGIT7){
				File file = new File("77.mp3");
				click(file, black11, black12);
			}
			if(event.getCode() == KeyCode.DIGIT8){
				File file = new File("79.mp3");
				click(file, black13, black14);
			}
			if(event.getCode() == KeyCode.DIGIT0){
				File file = new File("82.mp3");
				click(file, black15, black16);
			}
			if(event.getCode() == KeyCode.SUBTRACT){
				File file = new File("84.mp3");
				click(file, black17, black18);
			}
			if(event.getCode() == KeyCode.EQUALS){
				File file = new File("86.mp3");
				click(file, black19, black20);
			}
			
		}

	}
	@FXML
	public void press_Released(KeyEvent event) {
		if(event.getCode() == KeyCode.Z)
		{

		release(white2, white1);

		}

		if(event.getCode() == KeyCode.S)
		{
					
		release(black2, black1);

		}
		if(event.getCode() == KeyCode.X)
		{

		release(white4, white3);

		}


		if(event.getCode() == KeyCode.C)
		{

		release(white6, white5);

		}


		if(event.getCode() == KeyCode.V)
		{

		release(white8, white7);

		}

		if(event.getCode() == KeyCode.B)
		{

		release(white10, white9);

		}

		if(event.getCode() == KeyCode.N)
		{

		release(white12, white11);

		}

		if(event.getCode() == KeyCode.M)
		{

		release(white14, white13);

		}

		if(event.getCode() == KeyCode.Y)
		{

		release(white16, white15);

		}

		if(event.getCode() == KeyCode.U)
		{

		release(white18, white17);

		}


		if(event.getCode() == KeyCode.I)
		{

		release(white20, white19);

		}


		if(event.getCode() == KeyCode.O)
		{

		release(white22, white21);

		}


		if(event.getCode() == KeyCode.P)
		{

		release(white24, white23);

		}


		if(event.getCode() == KeyCode.OPEN_BRACKET)
		{

		release(white26, white25);

		}


		if(event.getCode() == KeyCode.CLOSE_BRACKET)
		{

		release(white28, white27);

		}
		if(event.getCode() == KeyCode.D)
		{
					
		release(black4, black3);

		}

		if(event.getCode() == KeyCode.G)
		{
					
		release(black6, black5);

		}

		if(event.getCode() == KeyCode.H)
		{
					
		release(black8, black7);

		}

		if(event.getCode() == KeyCode.J)
		{
					
		release(black10, black9);

		}

		if(event.getCode() == KeyCode.DIGIT7)
		{
					
		release(black12, black11);

		}

		if(event.getCode() == KeyCode.DIGIT8)
		{
					
		release(black14, black13);

		}

		if(event.getCode() == KeyCode.DIGIT0)
		{
					
		release(black16, black15);

		}

		if(event.getCode() == KeyCode.SUBTRACT)
		{
					
		release(black18, black17);

		}

		if(event.getCode() == KeyCode.EQUALS)
		{
					
		release(black20, black19);

		}
	}
//	private static FileOutputStream os;
//	//采样率
//	private static float RATE = 44100f;
//	//编码格式PCM
//	private static AudioFormat.Encoding ENCODING = AudioFormat.Encoding.PCM_SIGNED;
//	//帧大小 16 
//	private static int SAMPLE_SIZE = 16;
//	//是否大端
//	private static boolean BIG_ENDIAN = true;
//	//通道数
//	private static int CHANNELS = 2;
// 
//	public static void main(String[] args) throws Exception{
//		if(args.length<1) {
//			save("D:/Github/123.mp3");
//		}else {
//			save(args[0]);
//		}
//	}
// 
//	public static void save(String path) throws Exception {
//		File file = new File(path);
//		
//		if(file.isDirectory()) {
//			if(!file.exists()) {
//				file.mkdirs();
//			}
//			file.createNewFile();
//		}
//		
//		AudioFormat audioFormat = new AudioFormat(ENCODING,RATE, SAMPLE_SIZE, CHANNELS, (SAMPLE_SIZE / 8) * CHANNELS,
//				RATE, BIG_ENDIAN);
//		TargetDataLine targetDataLine = AudioSystem.getTargetDataLine(audioFormat);
//		targetDataLine.open();
//		targetDataLine.start();
//		byte[] b = new byte[256];
//		int flag = 0;
//		os = new FileOutputStream(file);
//		while((flag = targetDataLine.read(b, 0, b.length))>0) {//从声卡中采集数据
//			os.write(b);
//			System.out.println(flag);
//		}
//	}

}
