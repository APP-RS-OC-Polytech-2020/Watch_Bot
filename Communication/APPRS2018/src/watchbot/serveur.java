package watchbot;

import Communication.InterfaceCommunication;


public class serveur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watchbot watchbot = Watchbot.create();
		InterfaceCommunication com = InterfaceCommunication.newInterfaceCommunication();
		com.startEcoute(watchbot);
		
		//com.sendMessage("193.48.125.65", "Ordre", "startSurveillance");
		//com.sendMessage("193.48.125.66", "Ordre", "stopSurveillance");
		//com.sendMessage("193.48.125.66", "Ordre", "startCartographie");
		//com.sendMessage("193.48.125.66", "Ordre", "stopCartographie");
		//com.sendMessage("193.48.125.66", "Ordre", "avance");
		//com.sendMessage("193.48.125.66", "Ordre", "recule");
		//com.sendMessage("193.48.125.66", "Ordre", "gauche");
		//com.sendMessage("193.48.125.66", "Ordre", "droite");
		//com.closeEcoute();
	}

}
