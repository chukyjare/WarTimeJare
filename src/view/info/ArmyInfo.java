package view.info;

import model.Type;

public class ArmyInfo {
	private int idArmy, currentBattalion, infantryQuantity, chivalryQuantity, archeryQuantity;
	private Type currentType;
	
	public ArmyInfo(int idArmy, int currentBattalion, int infantryQuantity, int chivalryQuantity, int archeryQuantity,
			Type currentType) {
		super();
		this.idArmy = idArmy;
		this.currentBattalion = currentBattalion;
		this.infantryQuantity = infantryQuantity;
		this.chivalryQuantity = chivalryQuantity;
		this.archeryQuantity = archeryQuantity;
		this.currentType = currentType;
	}

	public int getIdArmy() {
		return idArmy;
	}

	public int getCurrentBattalion() {
		return currentBattalion;
	}

	public int getInfantryQuantity() {
		return infantryQuantity;
	}

	public int getChivalryQuantity() {
		return chivalryQuantity;
	}

	public int getArcheryQuantity() {
		return archeryQuantity;
	}

	public Type getCurrentType() {
		return currentType;
	}
	
}
