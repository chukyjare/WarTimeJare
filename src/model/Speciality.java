package model;

public enum Speciality {
	sword(Type.infantry), spear(Type.infantry), arc(Type.archery), crossbow(Type.archery), lightArmor(Type.chivalry), weithgArmor(Type.chivalry);
	private Type type;

	private Speciality(Type type) {
		this.type = type;
	}

	public Type getType() {
		return type;
	}
	
}
