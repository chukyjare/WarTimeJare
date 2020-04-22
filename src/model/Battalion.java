package model;

import java.util.LinkedList;

public class Battalion implements Square{
	private int idBattalion;
	private final int maxSoldiers=20;
	private Type type;
	private LinkedList <Soldier> soldiers = new LinkedList<Soldier>();
	
	public LinkedList<Soldier> getSoldiers() {
		return soldiers;
	}

	public Battalion(int idBattalion, Type type) {
		super();
		this.idBattalion = idBattalion;
		this.type = type;
	}

	public int getIdBattalion() {
		return idBattalion;
	}

	public int getMaxSoldiers() {
		return maxSoldiers;
	}

	public Type getType() {
		return type;
	}

	public int getSoldiersQuantity() {
		return soldiers.size();
	}


	public boolean insertSoldier(Soldier soldier) {
		if (soldier.getSpeciality().getType().equals(type)) {	
			return soldiers.add(soldier);
		}
		return false;
	}
	
	
	
}
