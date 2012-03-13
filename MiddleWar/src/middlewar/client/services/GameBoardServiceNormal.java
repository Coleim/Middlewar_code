package middlewar.client.services;


import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.canvas.dom.client.CssColor;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

import middlewar.client.model.Character;
import middlewar.client.utils.ClientLogger;

/**
 * Service de l'ecran de jeu connecté au serveur de jeu.
 */
public class GameBoardServiceNormal implements GameBoardService {
	
	// Service (serveur) des personnages
	private CharacterServiceAsync characterService = (CharacterServiceAsync) GWT.create(CharacterService.class);
	
	/**
	 * Constructeur du service
	 */
	public GameBoardServiceNormal(){}

	@Override
	public void drawCharacterDescription(final int id,final Context2d context) {
		characterService.getCharacterById(id, new AsyncCallback<Character>() {

            public void onFailure(Throwable caught) { 
            	ClientLogger.showError(caught); 
            }

            public void onSuccess(Character result) {
        	    ICE.drawCircle(context, CssColor.make(255, 0, 0), 10, 10, 10);
            }
            
          });
	}
	
}
