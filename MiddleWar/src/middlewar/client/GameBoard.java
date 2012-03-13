package middlewar.client;


import middlewar.client.services.GameBoardService;
import middlewar.client.services.GameBoardServiceNormal;
import middlewar.client.services.GameBoardServiceTest;
import middlewar.client.utils.ClientLogger;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;

/**
 * Ecran de jeu de middlewar
 */
public class GameBoard extends Composite {

	// Délai de rafraichisement (millisecondes)
	static final int refreshRate = 25;
	
	// Binder
	private static final Binder binder = GWT.create(Binder.class);
	interface Binder extends UiBinder<Widget, GameBoard> { 
	}
	
	// Composants graphiques
	@UiField AbsolutePanel canvasholder;
	@UiField Button testB;

	// Services
	private GameBoardService serverInterface;
	
	// Mode de lancement du jeu
	public enum GameBoardMode {
		NORMAL,
		TEST
	}
	
	// Canevas HTML 5
	private Canvas canvas; 
	private Context2d context;
	static final int height = 400;
	static final int width = 400;
    static final String upgradeMessage = "Your browser does not support the HTML5 Canvas. Please upgrade your browser.";

	
	/**
	 * Constructeur
	 * @param mode  NORMAL : conecté au serveur
	 * 				TEST   : mode de test en local
	 */
	public GameBoard(GameBoardMode mode) {
		
		// Binder
		initWidget(binder.createAndBindUi(this));
		
		// Choix du mode de jeu
		if(mode == GameBoardMode.NORMAL)
		{
			// Mode de jeu normal (avec serveur)
			serverInterface = new GameBoardServiceNormal();
		}
		else if(mode == GameBoardMode.TEST)
		{
			// Mode de jeu de test (local)
			serverInterface = new GameBoardServiceTest();
		}
		else
		{ 
			// Error
			ClientLogger.showMessage("GameBoardMode not implemented");
		}
		
		// Creation du canevas si HTML5
		canvas = Canvas.createIfSupported();
	    if (canvas == null) {
	    	canvasholder.add(new Label(upgradeMessage));
	    	return;
	    }

	    // init des canevas
	    canvas.setWidth(width + "px");
	    canvas.setHeight(height + "px");
	    canvas.setCoordinateSpaceWidth(width);
	    canvas.setCoordinateSpaceHeight(height);
	    canvasholder.add(canvas);
	    context = canvas.getContext2d();

	    // Game Timer
	    final Timer timer = new Timer() {
	      @Override
	      public void run() {
	        gameUpdate();
	      }
	    };
	    timer.scheduleRepeating(refreshRate);

	}

	/**
	 * Méthode de rafraichisement du jeu
	 */
	private void gameUpdate() {
		// TODO
	}


	/* Handlers */
	
	@UiHandler("testB")
	void onSelectMeAnchorClick(ClickEvent event) {
		serverInterface.drawCharacterDescription(1, context);
	}
	
}
