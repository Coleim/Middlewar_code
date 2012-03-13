package middlewar.server;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Gestion des logs/Messages cot� serveur
 */
public abstract class ServerLogger {

	/* Logger Log4j */
	private static final Logger logger = Logger.getLogger(ServerLogger.class);
	
	/**
	 * Ecriture d'un message d'erreur dans le fichier de log
	 * @param message le message a �crire
	 */
	public static void logError(String message)
	{
		 logger.log(Level.ERROR, message);
	}
	
	/**
	 * Ecriture d'un message de d�bug dans le fichier de log
	 * @param message le message a �crire
	 */
	public static void logDebug(String message)
	{
		 logger.log(Level.DEBUG, message);
	}
	
}
