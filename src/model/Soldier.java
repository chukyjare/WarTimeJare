package model;

public class Soldier {
	private String name;
	private int stamina=100, exp=1, atack=1, defense=1;
	private Speciality speciality;
	
	public Soldier(Speciality speciality) {
		super();
		this.speciality = speciality;
	}

	public Speciality getSpeciality() {
		return speciality;
	}
	


	
	
	
	
}
