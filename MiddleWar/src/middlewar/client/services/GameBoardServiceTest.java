package middlewar.client.services;

import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.canvas.dom.client.CssColor;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Panel;

/**
 * Service de l'ecran de jeu pour tests en local.
 */
public class GameBoardServiceTest implements GameBoardService {
	
	/**
	 * Constructeur du service
	 */
	public GameBoardServiceTest(){}

	@Override
	public void drawCharacterDescription(final int id,final Context2d context) {
		ICE.drawCircle(context, CssColor.make(0, 0, 255), 10, 10, 10);
	}
	
}
