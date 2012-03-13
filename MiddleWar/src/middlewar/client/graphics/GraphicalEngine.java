package middlewar.client.graphics;

import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.canvas.dom.client.CssColor;

/**
 * Interface du moteur graphique de middlewar. 
 * Définit toutes les fonctions accessibles pour générér des graphismes.
 */
public interface GraphicalEngine {

	/**
	 * Dessine un cercle plein
	 * @param context contexte graphique
	 * @param color couleur du cercle
	 * @param x position (X)
	 * @param y position (Y)
	 * @param z taille
	 */
	public void drawCircle(Context2d context,CssColor color,int x, int y, int z);

}
