package view.info;

import model.Speciality;

public class SpecificationSoldiersInfo {
	private Speciality speciality;
	private int quantity;
	
	public SpecificationSoldiersInfo(String speciality, int quantity) {
		super();
		this.speciality = Speciality.getName(speciality);
		this.quantity = quantity;
	}

	public Speciality getSpeciality() {
		return speciality;
	}

	public int getQuantity() {
		return quantity;
	}
	
	
}
