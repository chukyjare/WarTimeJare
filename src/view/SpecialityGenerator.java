package view;

import java.util.ArrayList;
import java.util.Arrays;

import assay.SoldiersSpecialityAssay;
import model.Speciality;
import model.Type;

public class SpecialityGenerator {

	

	public static ArrayList<SoldiersSpecialityAssay> getSpeciality(Type type) {
		ArrayList<SoldiersSpecialityAssay> panel= new ArrayList<SoldiersSpecialityAssay>();
		for (Speciality speciality : Arrays.asList(Speciality.values())) {
			if (speciality.getType()==type) {
				panel.add(new SoldiersSpecialityAssay(speciality));
			}
		}
		return panel;
	}
	
}
