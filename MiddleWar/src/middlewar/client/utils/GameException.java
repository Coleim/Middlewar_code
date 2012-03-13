package middlewar.client.utils;

/**
 * Exception de base spécifique au jeu
 */
@SuppressWarnings("serial")
public class GameException extends Exception{

	/**
	 * Constructeur de base
	 * @param message message de l'erreur
	 */
	public GameException(String message){
		super(message);
	}
	
}
