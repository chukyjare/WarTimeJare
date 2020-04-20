package model;

import java.util.Arrays;

public enum Speciality {
	sword(Type.infantry), spear(Type.infantry), arc(Type.archery), crossbow(Type.archery), lightArmor(Type.chivalry), weithgArmor(Type.chivalry);
	private Type type;

	private Speciality(Type type) {
		this.type = type;
	}

	public Type getType() {
		return type;
	}
	public static Speciality getName(String speciality) {
		
		for (Speciality specialityOne : Arrays.asList(Speciality.values())) {
			if (specialityOne.toString().equals(speciality)) {
				return specialityOne;
			}
		}
		
		return null;
	}
}
