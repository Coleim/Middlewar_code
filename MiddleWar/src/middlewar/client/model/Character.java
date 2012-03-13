package middlewar.client.model;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * Personnage du jeu (au sens large)
 */
public class Character implements IsSerializable{

	// Identifiant du personnage
	private long id;

	/**
	 * Constructeur par défaut
	 */
	public Character() {
		this.id = -1;
	}
	
	/* Gets / Sets */
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
