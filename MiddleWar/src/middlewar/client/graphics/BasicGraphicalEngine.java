package middlewar.client.graphics;

import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.canvas.dom.client.CssColor;

/**
 * Base du moteur graphique de middlewar (ICE).
 */
public abstract class BasicGraphicalEngine implements GraphicalEngine {

	@Override
	public void drawCircle(Context2d context,CssColor color,int x, int y, int z) {
	    context.setFillStyle(color);
	    context.beginPath();
	    context.arc(x, y, z, 0, Math.PI * 2.0, true);
	    context.closePath();
	    context.fill();	
	}

}
