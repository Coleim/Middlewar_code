package middlewar.client.utils;

import com.google.gwt.user.client.Window;

/**
 * Gestion des logs/Messages cot� client
 */
public class ClientLogger {
	
	/**
	 * Affichage d'une erreur de l'application
	 * @param error l'erreur � afficher
	 */
	public static void showError(Throwable error)
	{
		Window.alert(error.getMessage());
	}

	/**
	 * Affichage d'un message
	 * @param message le message a afficher
	 */
	public static void showMessage(String message) {
		Window.alert(message);
	}
	
}
