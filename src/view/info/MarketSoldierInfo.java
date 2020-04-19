package view.info;

import model.Battalion;
import model.Type;

public class MarketSoldierInfo {
	private Type type;
	private int id;
	private final int maxSoldiers;
	
	public MarketSoldierInfo(Battalion battalion) {
		super();
		this.type=battalion.getType();
		this.id=battalion.getIdBattalion();
		this.maxSoldiers=battalion.getMaxSoldiers();
	}

	public Type getType() {
		return type;
	}

	public int getId() {
		return id;
	}

	public int getMaxSoldiers() {
		return maxSoldiers;
	}
	
	
	 
}
