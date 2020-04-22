package model;

import java.util.LinkedList;

public class Army {
	private int idArmy;
	private int infantry = 2, chivalry = 2, archery = 2, idCurrentBattalion = 0;
	LinkedList<Battalion> battalionGroup = new LinkedList<Battalion>();

	public Army(int idArmy, Battalion battalion) {
		super();
		this.idArmy = idArmy;
		createArmy(battalion);
	}

	private void createArmy(Battalion battalion) {
		for (Battalion battalions : battalionGroup) {
			battalionGroup.add(new Battalion(battalion.getIdBattalion(), battalion.getType()));
		}

	}

	public Type getTypeBattalion() {
		return getCurrentBattalion().getType();
	}

	private Battalion getCurrentBattalion() {
		return battalionGroup.get(idCurrentBattalion);
	}

	public int getIdArmy() {
		return idArmy;
	}

	public int getInfantry() {
		return infantry;
	}

	public int getChivalry() {
		return chivalry;
	}

	public int getArchery() {
		return archery;
	}

	public int getIdCurrentBattalion() {
		return idCurrentBattalion;
	}

	public LinkedList<Battalion> getBattalionGroup() {
		return battalionGroup;
	}

}
