import java.util.Random;

public class JPanel {
	
	static String[] animals = {
		
		"cow", "dog","cat","monkey","fish",
	};
	
	static String[] rel ={
		"Budhist","Christian","Aethist","Jewish", "Hindu", "Islamic"
		
	};
	
	static String[] lang= { "Afar",
							"Afrikaans",
							"Albanian",
							"Arabic",
							"Balanta",
							"Catlan",
							"English",
							"French",
							"German",
							"Haitian Creole"
	};
	
	static String[] stuff ={
		"I was abducted by aliens.",


		"I had to take my daughter to see the Hunger Games.",

		" I missed my flight.",

		" I made my flight but it was the wrong one.",

		"They mistook me for a terrorist and detained me.",

		" I forgot to set my alarm clock.",

		" I set my alarm clock but it was not plugged in.",

		" My alarm clock was recalled.",

		" They thought my iPad was a bomb and made me get off the plane.",

		" My GPS is out of warranty.",

		" I have DDS; (Directional Dysfunction Syndrome.)",

		" I didn’t know what day it was because I was looking at the Mayan Calender.",

		" I locked my keys in my car."
	};
	
	
	public static void getText(){
		Random rand = new Random();
		int ran = rand.nextInt(4)+1;
		int x;		
		
		if(ran == 1){
		x = rand.nextInt(5);
		Main.txt.setText(animals[x]+" ate my homework");
		}if(ran ==2){
			x = rand.nextInt(13);
			Main.txt.setText(stuff[x]);
		} if(ran == 3){
			x = rand.nextInt(10);
			Main.txt.setText(" I don’t speak " + lang[x] );
		} 
		
		if(ran ==4 ) {
			x = rand.nextInt(6);
			Main.txt.setText(" Today is a " +rel[x]+" holiday"  );
			
		}
		
	}
}

