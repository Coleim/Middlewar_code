package middlewar.client.services;

import middlewar.client.graphics.GraphicalEngine;
import middlewar.client.graphics.ice.IceCreamEngine;
import com.google.gwt.canvas.dom.client.Context2d;

/**
 * Service associ� a l'�cran de jeu. Impl�ment� soit pour des tests
 * en local ou pour un fonctonement normal :
 * GameBoardServiceNormal
 * GameBoardServiceTest
 */
public interface GameBoardService {

	/* Moteur graphique */
	public final GraphicalEngine ICE = new IceCreamEngine();

	/**
	 * Affichage des informations sur un personnage
	 * @param id identifiant du personnage
	 * @param context le contexte graphique
	 */
	public void drawCharacterDescription(final int id,final Context2d context);
	
}
